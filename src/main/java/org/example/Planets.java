package org.example;

public enum Planets {
    MERCURY(1, 0,2430,null,"Venus"),
    VENUS(2,51,4612,Planets.MERCURY,"Earth"),
    EARTH(3,41,6378,Planets.VENUS,"Mars"),
    MARS(4,80,9773,Planets.EARTH,"Jupiter"),
    JUPITER(5,549,33169,Planets.MARS,"Saturn"),
    SATURN(6,551,58410,Planets.JUPITER,"Uranus"),
    URANUS(7,1500,122330,Planets.SATURN,"Neptune"),
    NEPTUNE(8,1620,191340,Planets.URANUS,"This is the last planet in Solar system ");

    private final Integer numberOfPlanet;
    private final Integer distanceFromPrevPlanet;
    private final Integer distanceFromSun;
    private final Integer radius;
    private final Planets prevPlanet;
    private final String nextPlanet;

    Planets(Integer numberOfPlanet, Integer distanceFromPrevPlanet,Integer radius,Planets prevPlanet,String nextPlanet) {
        this.numberOfPlanet = numberOfPlanet;
        this.distanceFromPrevPlanet = distanceFromPrevPlanet;
        this.radius=radius;
        this.prevPlanet=prevPlanet;
        this.nextPlanet=nextPlanet;
        this.distanceFromSun = countDistanceToSun(this);
    }
    public Integer getDistanceFromPrevPlanet() {
        return distanceFromPrevPlanet;
    }
    public Integer getRadius() {
        return radius;
    }
    public Integer getNumberOfPlanet() {
        return numberOfPlanet;
    }
    public Planets getPrevPlanet() {
        return prevPlanet;
    }
    public String getNextPlanet() {
        return nextPlanet;
    }
    public Integer getDistanceFromSun(){
        return distanceFromSun;
    }

    @Override
    public String toString() {
        return "Planets{" + this.name() +
                "numberOfPlanet=" + numberOfPlanet +
                ", distanceFromPrevPlanet=" + distanceFromPrevPlanet +
                ", distanceFromSun=" + distanceFromSun +
                ", radius=" + radius +
                ", prevPlanet=" + (prevPlanet == null ? null : prevPlanet.name()) +
                ", nextPlanet='" + nextPlanet + '\'' +
                '}';
    }

    private Integer countDistanceToSun(Planets planet) {
        Planets currentPlanet = planet;
        int distance = 0;
        while(currentPlanet != null) {
            distance += currentPlanet.getDistanceFromPrevPlanet();
            currentPlanet = currentPlanet.prevPlanet;
        }
        return distance;
    }
}
