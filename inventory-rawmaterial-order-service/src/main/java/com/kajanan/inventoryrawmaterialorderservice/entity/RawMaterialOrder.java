package com.kajanan.inventoryrawmaterialorderservice.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import com.kajanan.inventoryrawmaterialorderservice.enums.OrderStatus;
import com.kajanan.inventoryrawmaterialorderservice.enums.QualityCheck;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RawMaterialOrder {
  @Id
  @SequenceGenerator(name = "raw_material_order_id_sequence", initialValue = 100000, allocationSize = 1)
  @GeneratedValue(generator = "raw_material_order_id_sequence", strategy = GenerationType.SEQUENCE)
  private Long rawMaterialOrderId;

  private Double quantity;
  private Double pricePerUnit;
  // @Enumerated(EnumType.STRING)
  // private MeasurementUnit measurementUnit;
  @Enumerated(EnumType.STRING)
  private QualityCheck qualityCheck;
  @Enumerated(EnumType.STRING)
  private OrderStatus orderStatus;

  private LocalDate deliveryDate;
  private LocalDate expiryDate;
  private LocalDate orderedOn;

  @ManyToOne
  @JoinColumn(name = "supplierId", referencedColumnName = "supplierId", foreignKey = @ForeignKey(name = "FK_raw_matr_supplier_ID"))
  private Supplier supplier;
  @ManyToOne
  @JoinColumn(name = "rawMaterialId", referencedColumnName = "rawMaterialId", foreignKey = @ForeignKey(name = "FK_raw_matr_order_ID"))
  private RawMaterial rawMaterial;
}
