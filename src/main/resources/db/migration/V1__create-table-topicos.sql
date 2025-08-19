create table topicos(
    id bigint not null auto_increment,
    titulo varchar(150) not null,
    mensaje varchar(255) not null,
    fecha_de_creacion date not null,
    status varchar(100) not null,
    autor varchar(100) not null,
    curso varchar(255) not null,

    primary key(id)
);