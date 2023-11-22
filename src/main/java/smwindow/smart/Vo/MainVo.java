package smwindow.smart.Vo;

public class MainVo {
    private Long id;
    private float humi; //습도
    private float temp; //온도
    private int raindrops_status; //빗물

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getHumi() {
        return humi;
    }

    public void setHumi(float humi) {
        this.humi = humi;
    }
    public float getTemp() {
        return temp;
    }
    public void setTemp(float temp) {
        this.temp = temp;
    }
    public int getRaindrops_status() {
        return raindrops_status;
    }
    public void setRaindrops_status(int raindrops_status) {
        this.raindrops_status = raindrops_status;
    }
}
