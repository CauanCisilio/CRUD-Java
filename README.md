# CRUD-Java

Aplicação para cadastro e administração de funcionários de uma empresa com interface gráfica **swing**

<h2>Necessário</h2>
- Java 8 <br>
- PostgreSQL <br>
- JDBC para Java 8/ https://jdbc.postgresql.org/download/ <br>
- Criar a base de dados **funcionarios** <br>

<h2>Execute a Query SQL</h2>


CREATE TABLE funcionarios(                  <br>
  matricula integer NOT NULL,               <br>
  nome VARCHAR(100)  NOT NULL,              <br>
  cargo VARCHAR(100)  NOT NULL,             <br>
  salario numeric(10,2)NOT NULL,            <br>
  CONSTRAINT pk_cod PRIMARY KEY (matricula) <br>
)


<h2>Execute a Query SQL para usuário do sistema</h2>

CREATE TABLE usuarios                        <br>
(                                            <br>
   id SERIAL PRIMARY KEY,                    <br>
   usuario VARCHAR(100) NOT NULL,            <br>
   senha VARCHAR(20)  NOT NULL               <br>
)                                            <br>
Obs: faça a inserção do usuário através da SGDB do PostgreSQL

INSERT INTO usuarios(usuario,senha) VALUES ('seuUsuarioAqui','SuaSenha');



#Tela de Login 
![image](https://github.com/CauanCisilio/CRUD-Java/assets/110429744/fa4b522f-9632-4dcb-98be-5b2f5c510c53)

#Tela de cadastro / atualização de cadastro do funcionário / Exclusão de funcionários

![image](https://github.com/CauanCisilio/CRUD-Java/assets/110429744/bdbbf1a1-c38b-4e78-80f4-8f7f5cac1c0d)

#Listagem de funcionários e busca individual
![image](https://github.com/CauanCisilio/CRUD-Java/assets/110429744/a1aa3e0d-7eb6-492b-b8a0-030689178914)
