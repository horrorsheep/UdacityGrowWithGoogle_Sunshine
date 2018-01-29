/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.android.sunshine.data.SunshinePreferences;

public class MainActivity extends AppCompatActivity {

    // TODO (1) Create a field to store the weather display TextView
    TextView weatherview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        weatherview = (TextView) findViewById(R.id.tv_weather_data);
        // TODO (2) Use findViewById to get a reference to the weather display TextView
        String[] weatherdata = {
                "Today, Jan 28 - Clear - 13°C / 9°C",
                "Tomorrow - Cloudy - 17°C / 7°C",
                "Tuesday - Sunny - 17°C / 6°C",
                "Wednesday - Partly Cloudy - 17°C / 7°C",
                "Thursday - Partly Cloudy - 18°C / 8°C",
                "Friday - Sunny - 19°C / 9°C",
                "Saturday - Sunny - 15°C / 10°C",
                "Sunday - Sunny - 16°C / 7°C",
                "Monday - Cloudy - 19°C / 15°C",
                "Tuesday - Rainy - 12°C / 11°C",
                "Wednesday - Partly Rainy - 15°C / 9°C",
                "Thursday - Sunny - 16°C / 7°C",
                "Friday - Rainy - 16°C / 8°C",
                };
        // TODO (3) Create an array of Strings that contain fake weather data
        for(String eachdata: weatherdata){
            weatherview.append(eachdata + "\n\n\n\n");
        }
        // TODO (4) Append each String from the fake weather data array to the TextView
    }
}