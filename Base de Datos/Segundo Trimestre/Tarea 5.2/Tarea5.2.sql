USE instituto;

/*Ejercicio 1*/
SELECT * FROM alumnos;

/*Ejercicio 2*/
SELECT nombre, localidad, fecha_nac FROM alumnos;

/*Ejercicio 3*/
SELECT nombre AS 'Nombre y apellidos' FROM alumnos;

/*Ejercicio 4*/
SELECT nombre, (faltas*2) AS 'Faltas de asistencia' FROM alumnos;

/*Ejercicio 5*/
SELECT * FROM alumnos
	WHERE localidad = 'Lorca';
    
/*Ejercicio 6*/
SELECT * FROM alumnos
	WHERE localidad = 'Murcia' OR localidad = 'Alhama de Murcia'
    ORDER BY localidad;
    
/*Ejercicio 7*/
SELECT * FROM alumnos
	WHERE localidad = 'Murcia' AND nivel='ESO' AND curso=1;
    
/*Ejercicio 8*/
SELECT * FROM alumnos
	WHERE localidad = 'Lorca' AND nivel='Bachillerato' AND falta>10;