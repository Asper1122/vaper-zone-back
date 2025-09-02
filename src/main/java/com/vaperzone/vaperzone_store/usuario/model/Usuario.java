package com.vaperzone.vaperzone_store.usuario.model;

import com.vaperzone.vaperzone_store.venta.model.Venta;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue
    private UUID id;

    private String username;

    private String email;

    private String password;

    private boolean enabled;

    private String telefono;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToMany(
            mappedBy = "usuario",
            fetch = FetchType.LAZY
    )
    @Builder.Default
    private List<Venta> ventas = new ArrayList<>();

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        String role = "ROLE_" + this.role;
        return List.of(new SimpleGrantedAuthority(role));
    }
}
