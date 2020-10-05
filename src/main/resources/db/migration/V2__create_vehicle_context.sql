CREATE TABLE BrakeType (
  Code varchar(255));
CREATE TABLE RollingStock2 (
  Id int NOT NULL PRIMARY KEY,
  Position  int NOT NULL, 
  StockType varchar(255));
CREATE TABLE Traction (
  Id int NOT NULL PRIMARY KEY,
  Type int NOT NULL,
  LocoTypeNumber    bigint, 
  LocoNumber        varchar(255), 
  LengthOverBuffers int NOT NULL, 
  NumberOfAxles     int NOT NULL, 
  Weight            int NOT NULL, 
  BrakeWeightG      int NOT NULL, 
  BrakeWeightP      int NOT NULL);
CREATE TABLE TractionInTrain (
  Traction int NOT NULL,
  DriverIndication int);
CREATE TABLE TractionType2 (
  Id int NOT NULL PRIMARY KEY,
  Code        varchar(255), 
  Description varchar(255));
CREATE TABLE TractionTypeName (
  Name varchar(255));
CREATE TABLE Train (
  Id int NOT NULL PRIMARY KEY,
  TrainType                   int NOT NULL, 
  OperationalTrainNumber      varchar(255), 
  ScheduledTimeAtHandover     date, 
  ScheduledDateTimeAtTransfer date, 
  TransferPoint               int, 
  TransfereeIM                int, 
  JourneySections             int, 
  TrainCompositionMessages    int);
CREATE TABLE TrainComposition (
  Id int NOT NULL PRIMARY KEY,
  BrakeType                  varchar(255), 
  LivestockOrPeopleIndicator int NOT NULL, 
  JourneySection             int);
CREATE TABLE Wagon (
  Code 		         varchar(255) NOT NULL PRIMARY KEY,
  NumberFreight      varchar(255), 
  TypeName           varchar(255), 
  LengthOverBuffers  int NOT NULL, 
  WagonNumberOfAxles int NOT NULL, 
  BrakeWeightG       int NOT NULL, 
  BrakeWeightP       int NOT NULL, 
  WagonWeightEmpty   int NOT NULL, 
  MaxSpeed           int NOT NULL);
CREATE TABLE WagonInTrain (
  Wagon              varchar(255) NOT NULL,
  BrakeType			 varchar(255) NOT NULL,
  TotalLoadWeight     int NOT NULL, 
  DangerGoodsInWagons int);
  
ALTER TABLE Traction ADD CONSTRAINT FKTraction739482 FOREIGN KEY (Type) REFERENCES TractionType2 (Id);
ALTER TABLE TractionInTrain ADD CONSTRAINT FKTractionIn474597 FOREIGN KEY (Traction) REFERENCES Traction (Id);
ALTER TABLE WagonInTrain ADD CONSTRAINT FKWagonInTra900040 FOREIGN KEY (Wagon) REFERENCES Wagon (Code);
ALTER TABLE WagonInTrain ADD CONSTRAINT FKWagonInTra545290 FOREIGN KEY (BrakeType) REFERENCES BrakeType (Code);

