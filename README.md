# Demo sistema de pedidos

## BackEnd - Java 8 con Spring Boot 2.6.0
##FrontdEnd - Angular 13
##Base de Datos - MySql 5.6.37

```sql
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema pedidos
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema pedidos
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS pedidos DEFAULT CHARACTER SET utf8 ;
USE pedidos ;

-- -----------------------------------------------------
-- Table pedidos.pedido
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS pedidos.pedido (
  id_pedido INT NOT NULL AUTO_INCREMENT,
  ticket VARCHAR(45) NULL,
  nombre_cliente VARCHAR(245) NULL,
  direccion_cliente VARCHAR(445) NULL,
  total DOUBLE NULL,
  fecha_compra DATE NULL,
  PRIMARY KEY (id_pedido))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table pedidos.detalle
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS pedidos.detalle (
  id_detalle_pedido INT NOT NULL AUTO_INCREMENT,
  nombre_articulo VARCHAR(245) NULL,
  codigo VARCHAR(45) NULL,
  precio DOUBLE NULL,
  pedido_id_pedido INT NOT NULL,
  PRIMARY KEY (id_detalle_pedido),
  INDEX fk_detalle_pedido_idx (pedido_id_pedido ASC),
  CONSTRAINT fk_detalle_pedido
    FOREIGN KEY (pedido_id_pedido)
    REFERENCES pedidos.pedido (id_pedido)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
```
