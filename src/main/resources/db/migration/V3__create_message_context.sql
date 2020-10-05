CREATE TABLE GenericMessage (
  Id int NOT NULL PRIMARY KEY,
  SenderReference varchar(255), 
  Sender          int, 
  Recipient       int,
  Status int NOT NULL,
  Type        int NOT NULL, 
  TypeVersion varchar(255), 
  Identifier  varchar(255), 
  DateTime    date);
  
CREATE TABLE TrainCompositionMessage (
  Id int NOT NULL PRIMARY KEY,
  GenericMessage int not null,
  ObjectType    varchar(255), 
  TrainId     int NOT NULL, 
  CompanyId     int, 
  Core          varchar(255), 
  Variant       varchar(255), 
  TimetableYear int NOT NULL);

ALTER TABLE TrainCompositionMessage ADD CONSTRAINT FKTrainCompo828194 FOREIGN KEY (GenericMessage) REFERENCES GenericMessage (Id);
ALTER TABLE TrainCompositionMessage ADD CONSTRAINT FKTrainCompo545052 FOREIGN KEY (TrainId) REFERENCES Train (Id);

