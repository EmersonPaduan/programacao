create database exmeplo;

use exmeplo;

create table venda(
	num_nota integer,
    data_venda date
);

create table produto(
	cod_prod integer,
    nome varchar(50),
    valor double
);

create table item_venda(
	num_nota integer,
    cod_produto integer,
    qtde integer,
    valor double
);

insert into venda values (1, '2022-06-03');
insert into venda values (2, '2022-06-04');

insert into produto values (1, 'mouse', 50);
insert into produto values (2, 'teclado', 80);

insert into item_venda values (1, 1, 1, 50);
insert into item_venda values (1, 2, 1, 80);
insert into item_venda values (2, 1, 2, 50);

select venda.num_nota, data_venda, nome, qtde, item_venda.valor
from venda, item_venda, produto
where venda.num_nota = item_venda.num_nota and
	item_venda.cod_produto = produto.cod_prod and
    venda.num_nota = 2;

select venda.num_nota, data_venda, sum(qtde * item_venda.valor)
from venda, item_venda, produto
where venda.num_nota = item_venda.num_nota and
	item_venda.cod_produto = produto.cod_prod and
    venda.num_nota = 2;