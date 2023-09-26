create database bd_empleados;
use bd_empleados;

create table empleados(

idEmpleado char(7),
apellidos varchar(50),
nombres varchar(50),
edad int,
sexo char(1),
salario int
);

drop table empleado;

insert into empleados values('EMP0001','TORRES','JOSE',22,'M',1500);
insert into empleados values('EMP0002','GARCIA','MARIA',21,'F',1750);
insert into empleados values('EMP0003','FLORES','JUAN',22,'M',1850);
insert into empleados values('EMP0004','CASAS','ANA',23,'F',2000);

select * from empleado;
                            
