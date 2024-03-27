  develop a code which could calculate Taxi fare like Ola/Uber does (different prices for all vehicle like mini, sedan, SUV ),
                enum VehicleType(
                    suv;
                    sedan;
                    mini
                ) 

            class vehicle{
            private string drivername;
                private boolean availability;
                //creating a contructor

                public  vehicle(String drivername){
                    this.drivername= drivername;
                    this.availability= availability;
                }
                
                //getter - setter for values
                public string getdrivername(){
                    return drivername;
                }
                public boolean isavailability(){
                    return availability;

                }
                public void setavailability(boolean availability){
                    this.availability = availability;


                }
            }

            class vehicleDestintion{
            private string location;
                private string pickuplocation;

                public vehicleDestintion(String location , string pickuplocation){
                    this.location = location;
                    this.pickuplocation = pickuplocation;
                }

                public string getlocation(){
                    return location;
                }

                public string getpickuplocation(){
                    return pickuplocation;
                }
            }

                class vehicleTypepricing{
               private String vehiclename;
              private  float vehicleprice;


              public vehicleTypepricing(String vehiclename , float vehicleprice){
                this.vehiclename= vehiclename;
                this.vehicleprice = vehicleprice;
              }

              public getvehiclename(){
                return vehiclename;
              }

              public float getVehiclePrice() {
                 return vehiclePrice;}
            }


            //main method
            public class Taxiservice{
               private  map <vehicleType , vehicle> vehicle = new HashMap<>();
               private map<vehicleType , vehicle>pricing = new HashMap<>();

                public Taxiservice(){
                   vehicle= new HashMap<>();
                   pricing = new HashMap<>();

                        //initializing map with taxi names:
                   vehicle.put(vehicleType.SUV , new vehicle("SUV"));
                    vehicle.put(vehicleType.SEDAN , new vehicle("SEDAN"));
                     vehicle.put(vehicleType.MINI , new vehicle("MINI"));

                     //initialing map with tax prices:
                     pricing.put(vehicleType.SUV , new vehicleTypepricing("SUV" , `10.of`));
                     pricing.put(vehicleType.SEDAN , new vehicleTypepricing("SEDAN" , `20.of`));  
                     pricing.put(vehicleType.MINI , new vehicleTypepricing("MINI" , `40.of`));
                   

                }

                //CALCULATE THE FAIR BASED ON TAXI AND DISTANCE TRAVELLED:
                    public  calculateFair(VehicleType vehicleType , float distance){
                        if(vehicleType == null)
                        {
                            System.out.print("vechile is invalid");
                            return -1;
                        }

                        if(vehicleType == null || !vehcile.isAvailability()){
                             System.out.print("vechile is not avaliabile");
                            return -1;
                        }
                        float fair = vehicleTypepricing.getvehicleprice() * distance;
                          System.out.print("The Fair of vehcile travelled" + fair);
                          return fair;
                    }
                     public static void main(String[] args) {
                    TaxiService taxiService = new TaxiService();

                   
                    float distance = 10.0f;// assume in miles  the distance
                    taxiService.calculateFare(VehicleType.MINI, distance);
                    taxiService.calculateFare(VehicleType.SEDAN, distance);
                    taxiService.calculateFare(VehicleType.SUV, distance);
    }
              
            }



