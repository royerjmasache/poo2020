package intropoo;

public class Time {
    // Definición de atributos
    private int hour;
    private int minute;
    private int second;
    /**
     * Método para obtener el valor de la variable hour
     * @return this.hour
     */
    // Creación de métodos
    public int getHour(){
        return this.hour;
    }
    /**
     * Método para obtener el valor de la variable minute
     * @return this.minute
     */
    public int getMinute(){
        return this.minute;
    }
    /**
     * Método para obtener el valor de la variable second
     * @return this.second
     */
    public int getSecond(){
        return this.second;
    }
    /**
     * Método para obtener time con un formato determinado
     * @return time
     */
    public String getTime(){
        String time = hour+":"+minute+":"+second;
        return time;
    }
    /**
     * Método para actualizar el valor global de la variable hour
     * @param hour
     */
    public void updateHour(int hour){
        // Uso de this para variables globales
        this.hour = hour;
    }
    /**
     * Método para actualizar el valor global de la variable minute
     * @param minute
     */
    public void updateMinute(int minute){
        // Uso de this para variables globales
        this.minute = minute;
    }

    /**
     * Método para actualizar el valor global de la variable second
     * @param second
     */
    public void updateSecond(int second){
        // Uso de this para variables globales
        this.second = second;
    }
}
