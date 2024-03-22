USE prueba;
-- Ejecutar el procedimiento almacenado para calcular los valores totales
CALL calcular_valor_total_asegurado();

-- Crear la vista para mostrar los datos actualizados
CREATE OR REPLACE VIEW vista_asegurados_actualizados AS
SELECT id, numero_identificacion, nombre, apellido, fecha_nacimiento, valor_asegurado, valor_total
FROM asegurados;
