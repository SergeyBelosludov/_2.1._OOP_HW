public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, double engineVolume, String color,
               int productionYear, String productionCountry) {

        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }

        this.model = model;

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }

        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "white";
        }

        if (productionYear > 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }

        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + productionYear + " года выпуска, сборка " + productionCountry +
                ", цвет " + color + ", объем двигателя " + engineVolume + " л.";
    }
}
