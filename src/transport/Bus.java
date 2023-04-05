package transport;
    public class Bus extends Transport<DriverD> {
        public Bus(String brand, String model, double engineVolume, DriverD driver) {
            super(brand, model, engineVolume, driver);
        }

        @Override
        public void startMove() {
            System.out.println(" Автобус марки " + getBrand() + " начал движение");
        }

        @Override
        public void finishMove() {
            System.out.println(" Автобус марки " + getBrand() + " закончил движение");
        }

        @Override
        public void pitStop() {
            System.out.println("Пит стоп у автобуса");
        }

        @Override
        public void theBestCircleTime() {
            int minBound = 100;
            int maxBound = 150;
            int theBestTimeMIns = (int) (minBound+ (maxBound - minBound)*Math.random());
            System.out.println("Лучшее время круга для автобуса в минутах " + theBestTimeMIns);
        }

        @Override
        public void maxSpeed() {
            int minBound = 100;
            int maxBound = 150;
            int maxSpeed = (int) (minBound+ (maxBound - minBound)*Math.random());
            System.out.println("Максимальная скорость для автобуса " + maxSpeed);
        }



        @Override
        public String getBrand() {
            return super.getBrand();
        }
    }

