insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');
insert into cozinha (id, nome) values (3, 'Italiana');
insert into cozinha (id, nome) values (4, 'Brasileira');

insert into restaurante (id, nome, taxa_frete, cozinha_id) values (1, 'Tai 123', 1.50, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (2, 'Tai 456', 1.60, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (3, 'Ind 321', 1.70, 2);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (4, 'Ind 654', 1.80, 2);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (5, 'Ita 789', 1.90, 3);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (6, 'Ita 123', 2.10, 3);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (7, 'Bra 321', 2.50, 4);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values (8, 'Bra 456', 2.90, 4);

insert into forma_pagamento (id, descricao) values (1, 'Cartão de Crédito');
insert into forma_pagamento (id, descricao) values (2, 'Cartão de Débito');
insert into forma_pagamento (id, descricao) values (3, 'Dinheiro');
insert into forma_pagamento (id, descricao) values (4, 'Boleto');

insert into permissao (id, nome, descricao) values (1, "CONSULTAR COZINHAS", "Permite consultar cozinhas" );
insert into permissao (id, nome, descricao) values (2, "EDITAR COZINHAS", "Permite editar cozinhas" );

insert into estado (id, nome) values (1, 'São Paulo');
insert into estado (id, nome) values (2, 'Rio de Janeiro');
insert into estado (id, nome) values (3, 'Minas Gerais');
insert into estado (id, nome) values (4, 'Paraná');

insert into cidade (id, nome, estado_id) values (1, 'São Paulo',1);
insert into cidade (id, nome, estado_id) values (2, 'São Bernardo do Campo',1);
insert into cidade (id, nome, estado_id) values (3, 'Rio de Janeiro',2);
insert into cidade (id, nome, estado_id) values (4, 'Niteroi',2);
insert into cidade (id, nome, estado_id) values (5, 'Belo Horizonte',3);
insert into cidade (id, nome, estado_id) values (6, 'Uberaba',3);
insert into cidade (id, nome, estado_id) values (7, 'Curitiba',4);
insert into cidade (id, nome, estado_id) values (8, 'Maringá',4);
