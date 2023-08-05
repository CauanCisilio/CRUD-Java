# CRUD-Java

Aplicação para cadastro e administração de funcionários de uma empresa com interface gráfica **swing**

#Necessário
- Java 8
- PostgreSQL
- JDBC para Java 8/ **https://jdbc.postgresql.org/download/**
- Criar a base de dados **funcionarios**

#Execute a Query SQL


CREATE TABLE funcionarios(
  matricula integer NOT NULL,
  nome VARCHAR(100)  NOT NULL,
  cargo VARCHAR(100)  NOT NULL,
  salario numeric(10,2),
  CONSTRAINT pk_cod PRIMARY KEY (matricula) -- definindo chave primaria, pois a matricula deve ser de identificação unica por funcionário
  )


#Execute a Query SQL para usuário do sistema

CREATE TABLE usuarios
(
   id SERIAL PRIMARY KEY,
   usuario VARCHAR(100) NOT NULL,
   senha VARCHAR(20)  NOT NULL
)
Obs: faça a inserção do usuário através da SGDB do PostgreSQL

INSERT INTO usuarios(usuario,senha) VALUES ('seuUsuarioAqui','SuaSenha');



#Tela de Login 
![image](https://github.com/CauanCisilio/CRUD-Java/assets/110429744/fa4b522f-9632-4dcb-98be-5b2f5c510c53)

#Tela de cadastro / atualização de cadastro do funcionário / Exclusão de funcionários

![image](https://github.com/CauanCisilio/CRUD-Java/assets/110429744/bdbbf1a1-c38b-4e78-80f4-8f7f5cac1c0d)

#Listagem de funcionários e busca individual
![image](https://github.com/CauanCisilio/CRUD-Java/assets/110429744/a1aa3e0d-7eb6-492b-b8a0-030689178914)
