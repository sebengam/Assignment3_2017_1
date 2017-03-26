/**
 * Created by Tank on 3/23/2017.
 */
public class airportsHashMaps {

    private  String airportCode;
    private  String airportName;

    public airportsHashMaps(String airportCode, String airportName){
        this.airportCode = airportCode;
        this.airportName = airportName;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String code) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setName(String name) {
        this.airportName = airportName;
    }

    @Override
    public String toString() {
        return "States HashMaps{" +
                "state code '" + airportCode + '\'' +
                ", state name '" + airportName + '\'' +
                '}';    }

}
