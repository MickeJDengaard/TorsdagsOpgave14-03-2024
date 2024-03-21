     class DieselCar extends AFuelCar {
         private boolean hasParticleFilter;
         int particleFee = (hasParticleFilter()) ? 0 : 1000;
         public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
             super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
             this.hasParticleFilter = hasParticleFilter;
         }
         @Override
         public String getFuelType() {
             return "Diesel";
         }
         Boolean hasParticleFilter() {
             return hasParticleFilter;
         }
         public int getRegistrationFee() {
             int kmPrLitre = getKmPrLitre();
             if (kmPrLitre <= 50 && kmPrLitre >= 20)
                 return 330 + 130 + particleFee;
             else if (kmPrLitre <= 20 && kmPrLitre >= 15)
                 return 1050 + 1390 + particleFee;
             else if (kmPrLitre <= 15 && kmPrLitre >= 10)
                 return 2340 + 1850 + particleFee;
             else if (kmPrLitre <= 10 && kmPrLitre >= 5)
                 return 5500 + 2770 + particleFee;
             else
                 return 10470 + 15260 + particleFee;
         }

         @Override
         public String toString() {
             return "Diesel car{" + "\n" + super.toString();
         }
     }

