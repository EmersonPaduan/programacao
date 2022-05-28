-- 1. Criar um novo BD (Schema)
create database aulabd;

-- 2. indica que todas as instruções são para o aulabd
use aulabd;

create table cliente (
	cpf integer not null,
    rg integer,
    nome varchar(50) not null,
    constraint PK_CLIENTE primary key(cpf)
);

create table produto (
	codigo integer not null auto_increment,
    descricao varchar(60) not null,
    preco_tabela double not null,
    qtde_disponivel integer not null,
    constraint PK_PRODUTO primary key(codigo)
);

create table venda (
	nf integer not null,
    data_venda date not null,
    cpf integer not null,
    constraint PK_VENDA primary key(nf)
);

-- apaga toda a estrutura e os dados da tabela (!CUIDADO!)
-- drop table venda;

create table venda_produto (
	nf integer not null,
    cod_produto integer not null,
    qtde_vendida integer not null,
    preco_venda double not null,
    constraint PK_VENDA_PRODUTO primary key(nf, cod_produto)
);

alter table produto
add constraint CH_PRECO check(preco_tabela >= 0),
add constraint CH_QTDE check(qtde_disponivel >= 0);

alter table venda
add constraint FK_VENDA foreign key(cpf) references cliente(cpf);

alter table venda_produto
add constraint CH_PRECO_VP check(preco_venda >= 0),
add constraint CH_QTDE_VP check(qtde_vendida >= 0);

-- Inserção dos dados nas tabelas
insert into cliente values(123456, 121212, 'Antonio da Cunha');
insert into cliente values(112233, 3322211, 'Maria Cristina Costa');

insert into produto values(null, 'Teclado', 100, 5);
insert into produto values(null, 'Mouse', 70, 8);

insert into venda values(100, '2010-06-12', 123456);
insert into venda values(101, '2010-06-12', 123456);

insert into venda_produto values (100, 1, 1, 100);
insert into venda_produto values (101, 2, 2, 70);

-- Consultas ao BD

-- 1. Listar todos os clientes
SELECT *
FROM cliente;

-- 2. liste os nomes e cpfs de todos os clientes
SELECT cpf, nome
FROM cliente;

-- 3. busque o nome do cliente cujo CPF é 112233
SELECT nome
FROM cliente
WHERE cpf = 112233;

-- 4. quais clientes não compraram nada
select nome
from cliente
where cpf not in (
	select distinct cpf
	from venda
	);
       
-- 5. qual a média de preços dos meus produtos
select avg(preco_tabela)
from produto;

-- 6. quais os clientes com suas NF
select nome, nf
from cliente, venda
where cliente.cpf = venda.cpf;

