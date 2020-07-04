

--Creacion de usuario[EN EL SYSTEM]
CREATE USER carlossalina IDENTIFIED BY carlos123;
GRANT ALL PRIVILEGES TO carlossalina;

--Creacion de Tablas[EN LA NUEVA CONEXION]
CREATE TABLE tipo_usurio(
 id_tipo NUMBER PRIMARY KEY,
 descripcion VARCHAR2(30) NOT NULL
);

CREATE TABLE usuario(
 id_usuario NUMBER PRIMARY KEY,
 nombre VARCHAR2(50) NOT NULL,
 apellidos VARCHAR2(80) NOT NULL,
 email VARCHAR2(100) UNIQUE,
 direccion VARCHAR2(100) NOT NULL,
 telefono NUMBER NOT NULL,
 id_tipo NUMBER NOT NULL,
 contrasenia VARCHAR2(50) NOT NULL
);

ALTER TABLE usuario ADD CONSTRAINT usuario_fk1 FOREIGN KEY (id_tipo) REFERENCES  tipo_usurio (id_tipo) ENABLE;

CREATE TABLE agente(
  id_agente NUMBER PRIMARY KEY,
  id_usuario NUMBER NOT NULL
);

ALTER TABLE agente ADD CONSTRAINT agente_fk1 FOREIGN KEY (id_usuario) REFERENCES  usuario (id_usuario) ENABLE;

CREATE TABLE curso(
  id_curso NUMBER PRIMARY KEY,
  institucion VARCHAR2(100) NOT NULL,
  cantidad_gente NUMBER NOT NULL,
  paquete_solicitado VARCHAR2(100) NOT NULL,
  nombre_representante VARCHAR2(100) NOT NULL,
  id_agente NUMBER NOT NULL
);

ALTER TABLE curso ADD CONSTRAINT curso_fk1 FOREIGN KEY (id_agente) REFERENCES  agente (id_agente) ENABLE;

CREATE TABLE apoderado(
  id_apoderado NUMBER PRIMARY KEY,
  id_usuario NUMBER NOT NULL,
  id_curso NUMBER NOT NULL
);

ALTER TABLE apoderado ADD CONSTRAINT apoderado_fk1 FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario) ENABLE;
ALTER TABLE apoderado ADD CONSTRAINT apoderado_fk2 FOREIGN KEY (id_curso) REFERENCES curso (id_curso) ENABLE;

CREATE TABLE seguro(
  id_seguro NUMBER NOT NULL,
  id_curso NUMBER NOT NULL,
  descripcion VARCHAR2(800) NOT NULL,
  precio NUMBER NOT NULL,
  accidente VARCHAR2(800) 
);

ALTER TABLE seguro ADD CONSTRAINT seguro_fk1 FOREIGN KEY (id_curso) REFERENCES curso (id_curso) ENABLE;

--Creacion de sequencias 
CREATE SEQUENCE SEQ_SEGURO
START WITH 1 
MINVALUE 1
MAXVALUE 9999
INCREMENT BY 1;

CREATE SEQUENCE SEQ_USUARIO
START WITH 1 
MINVALUE 1
MAXVALUE 9999
INCREMENT BY 1;

CREATE SEQUENCE SEQ_AGENTE
START WITH 1 
MINVALUE 1
MAXVALUE 9999
INCREMENT BY 1;


CREATE SEQUENCE SEQ_APODERADO
START WITH 1 
MINVALUE 1
MAXVALUE 9999
INCREMENT BY 1;

CREATE SEQUENCE SEQ_CURSO
START WITH 1 
MINVALUE 1
MAXVALUE 9999
INCREMENT BY 1;

--Procedimientos Almacenados usados en el codigo [EJECUTAR UNO POR UNO]
CREATE OR REPLACE PROCEDURE sp_insertarSeguro(curso NUMBER, des VARCHAR2, pre NUMBER, acc VARCHAR2)IS
BEGIN
   INSERT INTO seguro VALUES(SEQ_SEGURO.NEXTVAL, curso, des, pre, acc);
END;

CREATE OR REPLACE PROCEDURE sp_loguin(blin OUT sys_refcursor, usu VARCHAR2, clave VARCHAR2)AS
BEGIN
OPEN blin FOR
SELECT * FROM usuario WHERE nombre=usu AND contrasenia=clave;
END;

--Inserción de Datos
INSERT INTO tipo_usurio VALUES(1, 'Agente de Ventas');
INSERT INTO tipo_usurio VALUES(2, 'Apoderado');

INSERT INTO usuario VALUES(SEQ_USUARIO.NEXTVAL, 'Ricardo','Sanchez','ricardo@gmail.com','Puente Alto',931212,1,123);
INSERT INTO usuario VALUES(SEQ_USUARIO.NEXTVAL, 'Ignacio','Caballo','ig@gmail.com','Puente Asalto',93343242,2,123);

INSERT INTO agente VALUES(SEQ_AGENTE.NEXTVAL, 1);

INSERT INTO curso VALUES(SEQ_CURSO.NEXTVAL, 'San Luis Gonzaga',40,'Estadia en Chiloe por 15 dias, pack premium','Ignacio',1);
INSERT INTO curso VALUES(SEQ_CURSO.NEXTVAL, 'La Matte',43,'Isla de Pascual, pack platino','Gonzalo',1);

INSERT INTO apoderado VALUES(SEQ_APODERADO.NEXTVAL, 2,1);

INSERT INTO seguro VALUES(SEQ_SEGURO.NEXTVAL,1,'Cubre contra heridas y enfermedades',3000000,null);
INSERT INTO seguro VALUES(SEQ_SEGURO.NEXTVAL,2,'Cubre accidentes de viaje',3000000,'Cubre caidas, perdidas, accidentes en transporte');

COMMIT;