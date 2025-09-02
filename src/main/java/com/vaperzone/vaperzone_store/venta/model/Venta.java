package com.vaperzone.vaperzone_store.venta.model;

import com.vaperzone.vaperzone_store.usuario.model.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Venta {

    @Id
    @GeneratedValue
    private UUID id;

    private LocalDateTime fechaVenta;

    @OneToMany(
            mappedBy = "venta",
            fetch = FetchType.EAGER,
            orphanRemoval = true,
            cascade = CascadeType.ALL
    )
    @Builder.Default
    private List<LineaVenta> lineasVenta = new ArrayList<>();

    private boolean finalizada;

    @ManyToOne
    @Column(name = "usuario_id")
    private Usuario usuario;

    public void addLineaVenta(LineaVenta lineaVenta) {
        lineaVenta.setVenta(this);
        this.lineasVenta.add(lineaVenta);
    }
}
