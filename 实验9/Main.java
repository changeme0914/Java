public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.ShowState(new WeatherState() {
            @Override
            public void showState() {
                System.out.println("下雨");
            }
        });
        weather.ShowState(new WeatherState() {
            @Override
            public void showState() {
                System.out.println("下雪");
            }
        });
        weather.ShowState(new WeatherState() {
            @Override
            public void showState() {
                System.out.println("晴天");
            }
        });
    }
}
