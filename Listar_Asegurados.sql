USE prueba;
SELECT 
i.tipo_identificacion AS tipoIdentifiacion, 
a.numero_identificacion AS numeroIdentificacion, 
a.valor_asegurado AS valorAsegurado
FROM asegurados a
JOIN identificacion i ON a.id = i.asegurado_id;
