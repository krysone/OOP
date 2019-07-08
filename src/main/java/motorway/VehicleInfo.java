package motorway;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VehicleInfo {
    /*
    * Stwórz klasę VehicleInfo, która powinna posiadać numer rejestracyjny pojazdu (String), typ pojazdu (CarType),
    * oraz datę WJAZDU na autostradę.
     * */

    private String registratonPlate;
    private CarType typeOfCar;
    private Date motorwayEntrance;

    public static Date getCurrentTimeUsingDate(){
        Date date = new Date();
        String strDateFormat ="hh:mm:ss a";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate = dateFormat.format(date);
        return date;
    }


    public VehicleInfo(final String registratonPlate, final CarType typeOfCar, final Date motorwayEntrance) {
        this.registratonPlate = registratonPlate;
        this.typeOfCar = typeOfCar;
        this.motorwayEntrance = motorwayEntrance;
    }

    public String getRegistratonPlate() {
        return registratonPlate;
    }

    public CarType getTypeOfCar() {
        return typeOfCar;
    }

    public Date getMotorwayEntrance() {
        return motorwayEntrance;
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "registratonPlate='" + registratonPlate + '\'' +
                ", typeOfCar=" + typeOfCar +
                ", motorwayEntrance=" + motorwayEntrance +
                '}';
    }

    public static class Builder{
        private String registratonPlate;
        private CarType typeOfCar;
        private Date motorwayEntrance;

        public Builder setRegistratonPlate(final String registratonPlate) {
            this.registratonPlate = registratonPlate;
            return this;
        }

        public Builder setTypeOfCar(final CarType typeOfCar) {
            this.typeOfCar = typeOfCar;
            return this;
        }

        public Builder setMotorwayEntrance(final Date motorwayEntrance) {
            this.motorwayEntrance = motorwayEntrance;
            return this;
        }
        public VehicleInfo build(){
            return new VehicleInfo(registratonPlate,typeOfCar,motorwayEntrance);
        }
    }


}
