package com.example.newproject.Statistic.WorkTime;

public class Hours {

    private long Time;

    Hours(long Time)
    {
        this.Time = Time;
    }

    Hours(String Time)
    {
        this.Time = Long.parseLong(Time);
    }

    public long GetSecundsTime()
    {
        return Time;
    }

    public long GetHoursTime()
    {
        return Time / 3600;
    }

    @Override
    public String toString() {
        return Long.toString(GetSecundsTime());
    }

    public static Hours Add(Hours a , Hours b)
    {
        return new Hours(a.Time + b.Time);
    }

    public static Hours Sub(Hours a , Hours b)
    {
        return new Hours(a.Time - b.Time);
    }
    public static Hours Mult(Hours a , Hours b)
    {
        return new Hours(a.Time * b.Time);
    }
    public static Hours Div(Hours a , Hours b)
    {
        return new Hours(a.Time / b.Time);
    }

}
