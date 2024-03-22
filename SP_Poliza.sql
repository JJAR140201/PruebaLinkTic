USE prueba;
DELIMITER $$
CREATE PROCEDURE calcular_valor_total_asegurado()
BEGIN
    DECLARE asegurado_id INT;
    DECLARE valor_asegurado DOUBLE;
    DECLARE prima DOUBLE;
    DECLARE valor_total DOUBLE;
    
    -- Cursor para iterar sobre cada asegurado
    DECLARE cur CURSOR FOR
        SELECT id, valor_asegurado
        FROM asegurados;
        
    -- Manejador para errores
    DECLARE CONTINUE HANDLER FOR NOT FOUND
        SET asegurado_id = NULL;
    
    OPEN cur;
    
    -- Iterar sobre cada asegurado
    asegurado_loop: LOOP
        FETCH cur INTO asegurado_id, valor_asegurado;
        IF asegurado_id IS NULL THEN
            LEAVE asegurado_loop;
        END IF;
        
        -- Calcular la prima (en este ejemplo se asume un 10%)
        SET prima := valor_asegurado * 0.10;
        
        -- Calcular el valor total de la póliza
        SET valor_total := valor_asegurado + prima;
        
        -- Actualizar el valor total en la tabla de asegurados
        UPDATE asegurados
        SET valor_total = valor_total
        WHERE id = asegurado_id;
    END LOOP;
    
    CLOSE cur;
END$$
DELIMITER ;

