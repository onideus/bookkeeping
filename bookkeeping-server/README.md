# Bookkeeping Server
To start using the application, run the following commands from the bookkeeping-server module root directory (you must have docker installed):

`mvn clean package`  
`docker build -t bookkeeping-server:latest .`  
`docker-compose up`

Server will come online connected to a fresh Postgres database, initialized with all necessary tables.
Server is listening on 8070. Any data saved to the database is saved to the local volume until removed.
