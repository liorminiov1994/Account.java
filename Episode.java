public class Episode {
    String name;
    String overview;
    Date air_time;
  //  boolean is_watched;
    public Episode(String name, String overview, Date air_time) {
        this.name = name;
        this.overview = overview;
        this.air_time = air_time;
      //  is_watched = false;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Date getAir_time() {
        return air_time;
    }

    public void setAir_time(Date air_time) {
        this.air_time = air_time;
    }


}
