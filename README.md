Seguro API

API REST desenvolvida com Java + Spring Boot para gerenciamento de usuários.
O projeto implementa um CRUD completo utilizando arquitetura em camadas, boas práticas de desenvolvimento e integração com PostgreSQL.

Tecnologias Utilizadas
Java 17+
Spring Boot
Spring Web
Spring Data JPA (Hibernate)
PostgreSQL
Maven
Lombok
Postman (testes da API)
Arquitetura do Projeto

O projeto foi organizado seguindo boas práticas de arquitetura em camadas:

src/main/java/com/wellington/seguroapi

config → configurações da aplicação
controller → endpoints REST
domain → entidades do banco de dados
dto → objetos de transferência de dados
exception → exceções customizadas
mapper → conversão DTO ↔ Entity
repository → acesso ao banco de dados
service → regras de negócio
service.impl → implementação dos serviços
util → classes utilitárias

Funcionalidades

A API possui um CRUD completo de usuários.

Criar usuário
Listar usuários
Buscar usuário por ID
Deletar usuário

Endpoints da API

Criar usuário

POST /usuarios

Exemplo de requisição:

{
"nome": "Wellington",
"email": "wellington@email.com"
}

Listar usuários

GET /usuarios

Buscar usuário por ID

GET /usuarios/{id}

Deletar usuário

DELETE /usuarios/{id}

Banco de Dados

O projeto utiliza PostgreSQL.

Configuração no arquivo:

src/main/resources/application.properties

spring.datasource.url=jdbc:postgresql://localhost:5432/segurodb
spring.datasource.username=postgres
spring.datasource.password=******

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

O Hibernate cria automaticamente as tabelas ao iniciar a aplicação.

Como Executar o Projeto

1 - Clonar o repositório

git clone https://github.com/seuusuario/seguro-api-crud.git

2 - Criar o banco no PostgreSQL

CREATE DATABASE segurodb;

3 - Configurar usuário e senha no application.properties

4 - Executar a aplicação

SeguroapiApplication

A API ficará disponível em:

http://localhost:8080

Testes da API

Os endpoints podem ser testados utilizando:

Postman

Autor

Wellington Costa
