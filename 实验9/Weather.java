interface  WeatherState{
    void showState();
}
public class Weather {
    public void ShowState(WeatherState weatherState)
    {
        weatherState.showState();
    }
}