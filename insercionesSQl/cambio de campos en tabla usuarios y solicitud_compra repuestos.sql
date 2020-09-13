use soft1;

alter table usuario add column Fecha_registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP  
ON UPDATE CURRENT_TIMESTAMP;

-- ejecutar esto de primero para modificar la columna fecha 
alter table  solicitud_compra_repuestos drop column fecha ;

-- Despues esto para modificar la colomna fecha 
alter table solicitud_compra_repuestos add column fecha TIMESTAMP DEFAULT CURRENT_TIMESTAMP  
ON UPDATE CURRENT_TIMESTAMP;