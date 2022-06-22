package com.example.cryptocurrencypricesapp.network

import android.graphics.Color
import com.tradingview.lightweightcharts.api.options.enums.PriceAxisPosition
import com.tradingview.lightweightcharts.api.options.models.*
import com.tradingview.lightweightcharts.api.series.common.SeriesData
import com.tradingview.lightweightcharts.api.series.enums.LineStyle
import com.tradingview.lightweightcharts.api.series.enums.LineWidth
import com.tradingview.lightweightcharts.api.series.models.*
import com.tradingview.lightweightcharts.api.chart.models.color.toIntColor

@Suppress("LongMethod")
fun listBarChartSeriesBarData(): MutableList<SeriesData> {
    return mutableListOf(
        BarData(
            time = Time.StringTime("2018-10-19"),
            open = 180.34f,
            high = 180.99f,
            low = 178.57f,
            close = 179.85f
        ),
        BarData(
            time = Time.StringTime("2018-10-22"),
            open = 180.82f,
            high = 181.40f,
            low = 177.56f,
            close = 178.75f
        ),
        BarData(
            time = Time.StringTime("2018-10-23"),
            open = 175.77f,
            high = 179.49f,
            low = 175.44f,
            close = 178.53f
        ),
        BarData(
            time = Time.StringTime("2018-10-24"),
            open = 178.58f,
            high = 182.37f,
            low = 176.31f,
            close = 176.97f
        ),
        BarData(
            time = Time.StringTime("2018-10-25"),
            open = 177.52f,
            high = 180.50f,
            low = 176.83f,
            close = 179.07f
        ),
        BarData(
            time = Time.StringTime("2018-10-26"),
            open = 176.88f,
            high = 177.34f,
            low = 170.91f,
            close = 172.23f
        ),
        BarData(
            time = Time.StringTime("2018-10-29"),
            open = 173.74f,
            high = 175.99f,
            low = 170.95f,
            close = 173.20f
        ),
        BarData(
            time = Time.StringTime("2018-10-30"),
            open = 173.16f,
            high = 176.43f,
            low = 172.64f,
            close = 176.24f
        ),
        BarData(
            time = Time.StringTime("2018-10-31"),
            open = 177.98f,
            high = 178.85f,
            low = 175.59f,
            close = 175.88f
        ),
        BarData(
            time = Time.StringTime("2018-11-01"),
            open = 176.84f,
            high = 180.86f,
            low = 175.90f,
            close = 180.46f
        ),
        BarData(
            time = Time.StringTime("2018-11-02"),
            open = 182.47f,
            high = 183.01f,
            low = 177.39f,
            close = 179.93f
        ),
        BarData(
            time = Time.StringTime("2018-11-05"),
            open = 181.02f,
            high = 182.41f,
            low = 179.30f,
            close = 182.19f
        ),
        BarData(
            time = Time.StringTime("2018-11-06"),
            open = 181.93f,
            high = 182.65f,
            low = 180.05f,
            close = 182.01f
        ),
        BarData(
            time = Time.StringTime("2018-11-07"),
            open = 183.79f,
            high = 187.68f,
            low = 182.06f,
            close = 187.23f
        ),
        BarData(
            time = Time.StringTime("2018-11-08"),
            open = 187.13f,
            high = 188.69f,
            low = 185.72f,
            close = 188.00f
        ),
        BarData(
            time = Time.StringTime("2018-11-09"),
            open = 188.32f,
            high = 188.48f,
            low = 184.96f,
            close = 185.99f
        ),
        BarData(
            time = Time.StringTime("2018-11-12"),
            open = 185.23f,
            high = 186.95f,
            low = 179.02f,
            close = 179.43f
        ),
        BarData(
            time = Time.StringTime("2018-11-13"),
            open = 177.30f,
            high = 181.62f,
            low = 172.85f,
            close = 179.00f
        ),
        BarData(
            time = Time.StringTime("2018-11-14"),
            open = 182.61f,
            high = 182.90f,
            low = 179.15f,
            close = 179.90f
        ),
        BarData(
            time = Time.StringTime("2018-11-15"),
            open = 179.01f,
            high = 179.67f,
            low = 173.61f,
            close = 177.36f
        ),
        BarData(
            time = Time.StringTime("2018-11-16"),
            open = 173.99f,
            high = 177.60f,
            low = 173.51f,
            close = 177.02f
        ),
        BarData(
            time = Time.StringTime("2018-11-19"),
            open = 176.71f,
            high = 178.88f,
            low = 172.30f,
            close = 173.59f
        ),
        BarData(
            time = Time.StringTime("2018-11-20"),
            open = 169.25f,
            high = 172.00f,
            low = 167.00f,
            close = 169.05f
        ),
        BarData(
            time = Time.StringTime("2018-11-21"),
            open = 170.00f,
            high = 170.93f,
            low = 169.15f,
            close = 169.30f
        ),
        BarData(
            time = Time.StringTime("2018-11-23"),
            open = 169.39f,
            high = 170.33f,
            low = 168.47f,
            close = 168.85f
        ),
        BarData(
            time = Time.StringTime("2018-11-26"),
            open = 170.20f,
            high = 172.39f,
            low = 168.87f,
            close = 169.82f
        ),
        BarData(
            time = Time.StringTime("2018-11-27"),
            open = 169.11f,
            high = 173.38f,
            low = 168.82f,
            close = 173.22f
        ),
        BarData(
            time = Time.StringTime("2018-11-28"),
            open = 172.91f,
            high = 177.65f,
            low = 170.62f,
            close = 177.43f
        ),
        BarData(
            time = Time.StringTime("2018-11-29"),
            open = 176.80f,
            high = 177.27f,
            low = 174.92f,
            close = 175.66f
        ),
        BarData(
            time = Time.StringTime("2018-11-30"),
            open = 175.75f,
            high = 180.37f,
            low = 175.11f,
            close = 180.32f
        ),
        BarData(
            time = Time.StringTime("2018-12-03"),
            open = 183.29f,
            high = 183.50f,
            low = 179.35f,
            close = 181.74f
        ),
        BarData(
            time = Time.StringTime("2018-12-04"),
            open = 181.06f,
            high = 182.23f,
            low = 174.55f,
            close = 175.30f
        ),
        BarData(
            time = Time.StringTime("2018-12-06"),
            open = 173.50f,
            high = 176.04f,
            low = 170.46f,
            close = 175.96f
        ),
        BarData(
            time = Time.StringTime("2018-12-07"),
            open = 175.35f,
            high = 178.36f,
            low = 172.24f,
            close = 172.79f
        ),
        BarData(
            time = Time.StringTime("2018-12-10"),
            open = 173.39f,
            high = 173.99f,
            low = 167.73f,
            close = 171.69f
        ),
        BarData(
            time = Time.StringTime("2018-12-11"),
            open = 174.30f,
            high = 175.60f,
            low = 171.24f,
            close = 172.21f
        ),
        BarData(
            time = Time.StringTime("2018-12-12"),
            open = 173.75f,
            high = 176.87f,
            low = 172.81f,
            close = 174.21f
        ),
        BarData(
            time = Time.StringTime("2018-12-13"),
            open = 174.31f,
            high = 174.91f,
            low = 172.07f,
            close = 173.87f
        ),
        BarData(
            time = Time.StringTime("2018-12-14"),
            open = 172.98f,
            high = 175.14f,
            low = 171.95f,
            close = 172.29f
        ),
        BarData(
            time = Time.StringTime("2018-12-17"),
            open = 171.51f,
            high = 171.99f,
            low = 166.93f,
            close = 167.97f
        ),
        BarData(
            time = Time.StringTime("2018-12-18"),
            open = 168.90f,
            high = 171.95f,
            low = 168.50f,
            close = 170.04f
        ),
        BarData(
            time = Time.StringTime("2018-12-19"),
            open = 170.92f,
            high = 174.95f,
            low = 166.77f,
            close = 167.56f
        ),
        BarData(
            time = Time.StringTime("2018-12-20"),
            open = 166.28f,
            high = 167.31f,
            low = 162.23f,
            close = 164.16f
        ),
        BarData(
            time = Time.StringTime("2018-12-21"),
            open = 162.81f,
            high = 167.96f,
            low = 160.17f,
            close = 160.48f
        ),
        BarData(
            time = Time.StringTime("2018-12-24"),
            open = 160.16f,
            high = 161.40f,
            low = 158.09f,
            close = 158.14f
        ),
        BarData(
            time = Time.StringTime("2018-12-26"),
            open = 159.46f,
            high = 168.28f,
            low = 159.44f,
            close = 168.28f
        ),
        BarData(
            time = Time.StringTime("2018-12-27"),
            open = 166.44f,
            high = 170.46f,
            low = 163.36f,
            close = 170.32f
        ),
        BarData(
            time = Time.StringTime("2018-12-28"),
            open = 171.22f,
            high = 173.12f,
            low = 168.60f,
            close = 170.22f
        ),
        BarData(
            time = Time.StringTime("2018-12-31"),
            open = 171.47f,
            high = 173.24f,
            low = 170.65f,
            close = 171.82f
        ),
        BarData(
            time = Time.StringTime("2019-01-02"),
            open = 169.71f,
            high = 173.18f,
            low = 169.05f,
            close = 172.41f
        ),
        BarData(
            time = Time.StringTime("2019-01-03"),
            open = 171.84f,
            high = 171.84f,
            low = 168.21f,
            close = 168.61f
        ),
        BarData(
            time = Time.StringTime("2019-01-04"),
            open = 170.18f,
            high = 174.74f,
            low = 169.52f,
            close = 173.62f
        ),
        BarData(
            time = Time.StringTime("2019-01-07"),
            open = 173.83f,
            high = 178.18f,
            low = 173.83f,
            close = 177.04f
        ),
        BarData(
            time = Time.StringTime("2019-01-08"),
            open = 178.57f,
            high = 179.59f,
            low = 175.61f,
            close = 177.89f
        ),
        BarData(
            time = Time.StringTime("2019-01-09"),
            open = 177.87f,
            high = 181.27f,
            low = 177.10f,
            close = 179.73f
        ),
        BarData(
            time = Time.StringTime("2019-01-10"),
            open = 178.03f,
            high = 179.24f,
            low = 176.34f,
            close = 179.06f
        ),
        BarData(
            time = Time.StringTime("2019-01-11"),
            open = 177.93f,
            high = 180.26f,
            low = 177.12f,
            close = 179.41f
        ),
        BarData(
            time = Time.StringTime("2019-01-14"),
            open = 177.59f,
            high = 179.23f,
            low = 176.90f,
            close = 178.81f
        ),
        BarData(
            time = Time.StringTime("2019-01-15"),
            open = 176.08f,
            high = 177.82f,
            low = 175.20f,
            close = 176.47f
        ),
        BarData(
            time = Time.StringTime("2019-01-16"),
            open = 177.09f,
            high = 177.93f,
            low = 175.86f,
            close = 177.04f
        ),
        BarData(
            time = Time.StringTime("2019-01-17"),
            open = 174.01f,
            high = 175.46f,
            low = 172.00f,
            close = 174.87f
        ),
        BarData(
            time = Time.StringTime("2019-01-18"),
            open = 176.98f,
            high = 180.04f,
            low = 176.18f,
            close = 179.58f
        ),
        BarData(
            time = Time.StringTime("2019-01-22"),
            open = 177.49f,
            high = 178.60f,
            low = 175.36f,
            close = 177.11f
        ),
        BarData(
            time = Time.StringTime("2019-01-23"),
            open = 176.59f,
            high = 178.06f,
            low = 174.53f,
            close = 176.89f
        ),
        BarData(
            time = Time.StringTime("2019-01-24"),
            open = 177.00f,
            high = 177.53f,
            low = 175.30f,
            close = 177.29f
        ),
        BarData(
            time = Time.StringTime("2019-01-25"),
            open = 179.78f,
            high = 180.87f,
            low = 178.61f,
            close = 180.40f
        ),
        BarData(
            time = Time.StringTime("2019-01-28"),
            open = 178.97f,
            high = 179.99f,
            low = 177.41f,
            close = 179.83f
        ),
        BarData(
            time = Time.StringTime("2019-01-29"),
            open = 178.96f,
            high = 180.15f,
            low = 178.09f,
            close = 179.69f
        ),
        BarData(
            time = Time.StringTime("2019-01-30"),
            open = 180.47f,
            high = 184.20f,
            low = 179.78f,
            close = 182.18f
        ),
        BarData(
            time = Time.StringTime("2019-01-31"),
            open = 181.50f,
            high = 184.67f,
            low = 181.06f,
            close = 183.53f
        ),
        BarData(
            time = Time.StringTime("2019-02-01"),
            open = 184.03f,
            high = 185.15f,
            low = 182.83f,
            close = 184.37f
        ),
        BarData(
            time = Time.StringTime("2019-02-04"),
            open = 184.30f,
            high = 186.43f,
            low = 183.84f,
            close = 186.43f
        ),
        BarData(
            time = Time.StringTime("2019-02-05"),
            open = 186.89f,
            high = 186.99f,
            low = 184.69f,
            close = 186.39f
        ),
        BarData(
            time = Time.StringTime("2019-02-06"),
            open = 186.69f,
            high = 186.69f,
            low = 184.06f,
            close = 184.72f
        ),
        BarData(
            time = Time.StringTime("2019-02-07"),
            open = 183.74f,
            high = 184.92f,
            low = 182.45f,
            close = 184.07f
        ),
        BarData(
            time = Time.StringTime("2019-02-08"),
            open = 183.05f,
            high = 184.58f,
            low = 182.72f,
            close = 184.54f
        ),
        BarData(
            time = Time.StringTime("2019-02-11"),
            open = 185.00f,
            high = 185.42f,
            low = 182.75f,
            close = 182.92f
        ),
        BarData(
            time = Time.StringTime("2019-02-12"),
            open = 183.84f,
            high = 186.40f,
            low = 183.52f,
            close = 185.52f
        ),
        BarData(
            time = Time.StringTime("2019-02-13"),
            open = 186.30f,
            high = 188.68f,
            low = 185.92f,
            close = 188.41f
        ),
        BarData(
            time = Time.StringTime("2019-02-14"),
            open = 187.50f,
            high = 188.93f,
            low = 186.00f,
            close = 187.71f
        ),
        BarData(
            time = Time.StringTime("2019-02-15"),
            open = 189.87f,
            high = 192.62f,
            low = 189.05f,
            close = 192.39f
        ),
        BarData(
            time = Time.StringTime("2019-02-19"),
            open = 191.71f,
            high = 193.19f,
            low = 191.28f,
            close = 192.33f
        ),
        BarData(
            time = Time.StringTime("2019-02-20"),
            open = 192.39f,
            high = 192.40f,
            low = 191.11f,
            close = 191.85f
        ),
        BarData(
            time = Time.StringTime("2019-02-21"),
            open = 191.85f,
            high = 192.37f,
            low = 190.61f,
            close = 191.82f
        ),
        BarData(
            time = Time.StringTime("2019-02-22"),
            open = 191.69f,
            high = 192.54f,
            low = 191.62f,
            close = 192.39f
        ),
        BarData(
            time = Time.StringTime("2019-02-25"),
            open = 192.75f,
            high = 193.42f,
            low = 189.96f,
            close = 189.98f
        ),
        BarData(
            time = Time.StringTime("2019-02-26"),
            open = 185.59f,
            high = 188.47f,
            low = 182.80f,
            close = 188.30f
        ),
        BarData(
            time = Time.StringTime("2019-02-27"),
            open = 187.90f,
            high = 188.50f,
            low = 183.21f,
            close = 183.67f
        ),
        BarData(
            time = Time.StringTime("2019-02-28"),
            open = 183.60f,
            high = 185.19f,
            low = 183.11f,
            close = 185.14f
        ),
        BarData(
            time = Time.StringTime("2019-03-01"),
            open = 185.82f,
            high = 186.56f,
            low = 182.86f,
            close = 185.17f
        ),
        BarData(
            time = Time.StringTime("2019-03-04"),
            open = 186.20f,
            high = 186.24f,
            low = 182.10f,
            close = 183.81f
        ),
        BarData(
            time = Time.StringTime("2019-03-05"),
            open = 184.24f,
            high = 185.12f,
            low = 183.25f,
            close = 184.00f
        ),
        BarData(
            time = Time.StringTime("2019-03-06"),
            open = 184.53f,
            high = 184.97f,
            low = 183.84f,
            close = 184.45f
        ),
        BarData(
            time = Time.StringTime("2019-03-07"),
            open = 184.39f,
            high = 184.62f,
            low = 181.58f,
            close = 182.51f
        ),
        BarData(
            time = Time.StringTime("2019-03-08"),
            open = 181.49f,
            high = 181.91f,
            low = 179.52f,
            close = 181.23f
        ),
        BarData(
            time = Time.StringTime("2019-03-11"),
            open = 182.00f,
            high = 183.20f,
            low = 181.20f,
            close = 182.44f
        ),
        BarData(
            time = Time.StringTime("2019-03-12"),
            open = 183.43f,
            high = 184.27f,
            low = 182.33f,
            close = 184.00f
        ),
        BarData(
            time = Time.StringTime("2019-03-13"),
            open = 183.24f,
            high = 183.78f,
            low = 181.08f,
            close = 181.14f
        ),
        BarData(
            time = Time.StringTime("2019-03-14"),
            open = 181.28f,
            high = 181.74f,
            low = 180.50f,
            close = 181.61f
        ),
        BarData(
            time = Time.StringTime("2019-03-15"),
            open = 182.30f,
            high = 182.49f,
            low = 179.57f,
            close = 182.23f
        ),
        BarData(
            time = Time.StringTime("2019-03-18"),
            open = 182.53f,
            high = 183.48f,
            low = 182.33f,
            close = 183.42f
        ),
        BarData(
            time = Time.StringTime("2019-03-19"),
            open = 184.19f,
            high = 185.82f,
            low = 183.48f,
            close = 184.13f
        ),
        BarData(
            time = Time.StringTime("2019-03-20"),
            open = 184.30f,
            high = 187.12f,
            low = 183.43f,
            close = 186.10f
        ),
        BarData(
            time = Time.StringTime("2019-03-21"),
            open = 185.50f,
            high = 190.00f,
            low = 185.50f,
            close = 189.97f
        ),
        BarData(
            time = Time.StringTime("2019-03-22"),
            open = 189.31f,
            high = 192.05f,
            low = 188.67f,
            close = 188.75f
        ),
        BarData(
            time = Time.StringTime("2019-03-25"),
            open = 188.75f,
            high = 191.71f,
            low = 188.51f,
            close = 189.68f
        ),
        BarData(
            time = Time.StringTime("2019-03-26"),
            open = 190.69f,
            high = 192.19f,
            low = 188.74f,
            close = 189.34f
        ),
        BarData(
            time = Time.StringTime("2019-03-27"),
            open = 189.65f,
            high = 191.61f,
            low = 188.39f,
            close = 189.25f
        ),
        BarData(
            time = Time.StringTime("2019-03-28"),
            open = 189.91f,
            high = 191.40f,
            low = 189.16f,
            close = 190.06f
        ),
        BarData(
            time = Time.StringTime("2019-03-29"),
            open = 190.85f,
            high = 192.04f,
            low = 190.14f,
            close = 191.89f
        ),
        BarData(
            time = Time.StringTime("2019-04-01"),
            open = 192.99f,
            high = 195.90f,
            low = 192.85f,
            close = 195.64f
        ),
        BarData(
            time = Time.StringTime("2019-04-02"),
            open = 195.50f,
            high = 195.50f,
            low = 194.01f,
            close = 194.31f
        ),
        BarData(
            time = Time.StringTime("2019-04-03"),
            open = 194.98f,
            high = 198.78f,
            low = 194.11f,
            close = 198.61f
        ),
        BarData(
            time = Time.StringTime("2019-04-04"),
            open = 199.00f,
            high = 200.49f,
            low = 198.02f,
            close = 200.45f
        ),
        BarData(
            time = Time.StringTime("2019-04-05"),
            open = 200.86f,
            high = 203.13f,
            low = 200.61f,
            close = 202.06f
        ),
        BarData(
            time = Time.StringTime("2019-04-08"),
            open = 201.37f,
            high = 203.79f,
            low = 201.24f,
            close = 203.55f
        ),
        BarData(
            time = Time.StringTime("2019-04-09"),
            open = 202.26f,
            high = 202.71f,
            low = 200.46f,
            close = 200.90f
        ),
        BarData(
            time = Time.StringTime("2019-04-10"),
            open = 201.26f,
            high = 201.60f,
            low = 198.02f,
            close = 199.43f
        ),
        BarData(
            time = Time.StringTime("2019-04-11"),
            open = 199.90f,
            high = 201.50f,
            low = 199.03f,
            close = 201.48f
        ),
        BarData(
            time = Time.StringTime("2019-04-12"),
            open = 202.13f,
            high = 204.26f,
            low = 202.13f,
            close = 203.85f
        ),
        BarData(
            time = Time.StringTime("2019-04-15"),
            open = 204.16f,
            high = 205.14f,
            low = 203.40f,
            close = 204.86f
        ),
        BarData(
            time = Time.StringTime("2019-04-16"),
            open = 205.25f,
            high = 205.99f,
            low = 204.29f,
            close = 204.47f
        ),
        BarData(
            time = Time.StringTime("2019-04-17"),
            open = 205.34f,
            high = 206.84f,
            low = 205.32f,
            close = 206.55f
        ),
        BarData(
            time = Time.StringTime("2019-04-18"),
            open = 206.02f,
            high = 207.78f,
            low = 205.10f,
            close = 205.66f
        ),
        BarData(
            time = Time.StringTime("2019-04-22"),
            open = 204.11f,
            high = 206.25f,
            low = 204.00f,
            close = 204.78f
        ),
        BarData(
            time = Time.StringTime("2019-04-23"),
            open = 205.14f,
            high = 207.33f,
            low = 203.43f,
            close = 206.05f
        ),
        BarData(
            time = Time.StringTime("2019-04-24"),
            open = 206.16f,
            high = 208.29f,
            low = 205.54f,
            close = 206.72f
        ),
        BarData(
            time = Time.StringTime("2019-04-25"),
            open = 206.01f,
            high = 207.72f,
            low = 205.06f,
            close = 206.50f
        ),
        BarData(
            time = Time.StringTime("2019-04-26"),
            open = 205.88f,
            high = 206.14f,
            low = 203.34f,
            close = 203.61f
        ),
        BarData(
            time = Time.StringTime("2019-04-29"),
            open = 203.31f,
            high = 203.80f,
            low = 200.34f,
            close = 202.16f
        ),
        BarData(
            time = Time.StringTime("2019-04-30"),
            open = 201.55f,
            high = 203.75f,
            low = 200.79f,
            close = 203.70f
        ),
        BarData(
            time = Time.StringTime("2019-05-01"),
            open = 203.20f,
            high = 203.52f,
            low = 198.66f,
            close = 198.80f
        ),
        BarData(
            time = Time.StringTime("2019-05-02"),
            open = 199.30f,
            high = 201.06f,
            low = 198.80f,
            close = 201.01f
        ),
        BarData(
            time = Time.StringTime("2019-05-03"),
            open = 202.00f,
            high = 202.31f,
            low = 200.32f,
            close = 200.56f
        ),
        BarData(
            time = Time.StringTime("2019-05-06"),
            open = 198.74f,
            high = 199.93f,
            low = 198.31f,
            close = 199.63f
        ),
        BarData(
            time = Time.StringTime("2019-05-07"),
            open = 196.75f,
            high = 197.65f,
            low = 192.96f,
            close = 194.77f
        ),
        BarData(
            time = Time.StringTime("2019-05-08"),
            open = 194.49f,
            high = 196.61f,
            low = 193.68f,
            close = 195.17f
        ),
        BarData(
            time = Time.StringTime("2019-05-09"),
            open = 193.31f,
            high = 195.08f,
            low = 191.59f,
            close = 194.58f
        ),
        BarData(
            time = Time.StringTime("2019-05-10"),
            open = 193.21f,
            high = 195.49f,
            low = 190.01f,
            close = 194.58f
        ),
        BarData(
            time = Time.StringTime("2019-05-13"),
            open = 191.00f,
            high = 191.66f,
            low = 189.14f,
            close = 190.34f
        ),
        BarData(
            time = Time.StringTime("2019-05-14"),
            open = 190.50f,
            high = 192.76f,
            low = 190.01f,
            close = 191.62f
        ),
        BarData(
            time = Time.StringTime("2019-05-15"),
            open = 190.81f,
            high = 192.81f,
            low = 190.27f,
            close = 191.76f
        ),
        BarData(
            time = Time.StringTime("2019-05-16"),
            open = 192.47f,
            high = 194.96f,
            low = 192.20f,
            close = 192.38f
        ),
        BarData(
            time = Time.StringTime("2019-05-17"),
            open = 190.86f,
            high = 194.50f,
            low = 190.75f,
            close = 192.58f
        ),
        BarData(
            time = Time.StringTime("2019-05-20"),
            open = 191.13f,
            high = 192.86f,
            low = 190.61f,
            close = 190.95f
        ),
        BarData(
            time = Time.StringTime("2019-05-21"),
            open = 187.13f,
            high = 192.52f,
            low = 186.34f,
            close = 191.45f
        ),
        BarData(
            time = Time.StringTime("2019-05-22"),
            open = 190.49f,
            high = 192.22f,
            low = 188.05f,
            close = 188.91f
        ),
        BarData(
            time = Time.StringTime("2019-05-23"),
            open = 188.45f,
            high = 192.54f,
            low = 186.27f,
            close = 192.00f
        ),
        BarData(
            time = Time.StringTime("2019-05-24"),
            open = 192.54f,
            high = 193.86f,
            low = 190.41f,
            close = 193.59f
        ),
        BarData(
            time = Time.StringTime("2019-05-28"),
            open = 194.38f,
            high = 196.47f,
            low = 193.75f,
            close = 194.08f,
            color = Color.GREEN.toIntColor()
        )
    )
}

@Suppress("LongMethod")
fun listCustomPriceFormatterSeriesLineData(): MutableList<SeriesData> {
    return mutableListOf(
        LineData(Time.StringTime("2018-10-19"), 72.35f),
        LineData(Time.StringTime("2018-10-22"), 72.57f),
        LineData(Time.StringTime("2018-10-23"), 72.10f),
        LineData(Time.StringTime("2018-10-24"), 70.54f),
        LineData(Time.StringTime("2018-10-25"), 69.96f),
        LineData(Time.StringTime("2018-10-26"), 70.40f),
        LineData(Time.StringTime("2018-10-29"), 71.45f),
        LineData(Time.StringTime("2018-10-30"), 72.87f),
        LineData(Time.StringTime("2018-10-31"), 73.61f),
        LineData(Time.StringTime("2018-11-01"), 73.12f),
        LineData(Time.StringTime("2018-11-02"), 72.27f),
        LineData(Time.StringTime("2018-11-05"), 73.12f),
        LineData(Time.StringTime("2018-11-06"), 73.31f),
        LineData(Time.StringTime("2018-11-07"), 75.08f),
        LineData(Time.StringTime("2018-11-08"), 75.48f),
        LineData(Time.StringTime("2018-11-09"), 74.86f),
        LineData(Time.StringTime("2018-11-12"), 74.69f),
        LineData(Time.StringTime("2018-11-13"), 74.61f),
        LineData(Time.StringTime("2018-11-14"), 74.09f),
        LineData(Time.StringTime("2018-11-15"), 74.84f),
        LineData(Time.StringTime("2018-11-16"), 76.06f),
        LineData(Time.StringTime("2018-11-19"), 76.35f),
        LineData(Time.StringTime("2018-11-20"), 74.78f),
        LineData(Time.StringTime("2018-11-21"), 74.79f),
        LineData(Time.StringTime("2018-11-23"), 74.67f),
        LineData(Time.StringTime("2018-11-26"), 75.44f),
        LineData(Time.StringTime("2018-11-27"), 76.34f),
        LineData(Time.StringTime("2018-11-28"), 77.23f),
        LineData(Time.StringTime("2018-11-29"), 77.91f),
        LineData(Time.StringTime("2018-11-30"), 79.34f),
        LineData(Time.StringTime("2018-12-03"), 79.22f),
        LineData(Time.StringTime("2018-12-04"), 78.21f),
        LineData(Time.StringTime("2018-12-06"), 78.37f),
        LineData(Time.StringTime("2018-12-07"), 76.72f),
        LineData(Time.StringTime("2018-12-10"), 77.42f),
        LineData(Time.StringTime("2018-12-11"), 77.11f),
        LineData(Time.StringTime("2018-12-12"), 78.01f),
        LineData(Time.StringTime("2018-12-13"), 79.01f),
        LineData(Time.StringTime("2018-12-14"), 76.48f),
        LineData(Time.StringTime("2018-12-17"), 75.23f),
        LineData(Time.StringTime("2018-12-18"), 74.33f),
        LineData(Time.StringTime("2018-12-19"), 73.77f),
        LineData(Time.StringTime("2018-12-20"), 73.49f),
        LineData(Time.StringTime("2018-12-21"), 72.90f),
        LineData(Time.StringTime("2018-12-24"), 71.15f),
        LineData(Time.StringTime("2018-12-26"), 74.00f),
        LineData(Time.StringTime("2018-12-27"), 75.38f),
        LineData(Time.StringTime("2018-12-28"), 75.37f),
        LineData(Time.StringTime("2018-12-31"), 76.41f),
        LineData(Time.StringTime("2019-01-02"), 75.59f),
        LineData(Time.StringTime("2019-01-03"), 74.04f),
        LineData(Time.StringTime("2019-01-04"), 76.27f),
        LineData(Time.StringTime("2019-01-07"), 75.43f),
        LineData(Time.StringTime("2019-01-08"), 75.99f),
        LineData(Time.StringTime("2019-01-09"), 75.41f),
        LineData(Time.StringTime("2019-01-10"), 74.48f),
        LineData(Time.StringTime("2019-01-11"), 74.90f),
        LineData(Time.StringTime("2019-01-14"), 73.37f),
        LineData(Time.StringTime("2019-01-15"), 74.50f),
        LineData(Time.StringTime("2019-01-16"), 74.61f),
        LineData(Time.StringTime("2019-01-17"), 75.60f),
        LineData(Time.StringTime("2019-01-18"), 75.87f),
        LineData(Time.StringTime("2019-01-22"), 75.83f),
        LineData(Time.StringTime("2019-01-23"), 75.44f),
        LineData(Time.StringTime("2019-01-24"), 73.17f),
        LineData(Time.StringTime("2019-01-25"), 72.95f),
        LineData(Time.StringTime("2019-01-28"), 72.92f),
        LineData(Time.StringTime("2019-01-29"), 73.23f),
        LineData(Time.StringTime("2019-01-30"), 73.37f),
        LineData(Time.StringTime("2019-01-31"), 74.43f),
        LineData(Time.StringTime("2019-02-01"), 76.45f),
        LineData(Time.StringTime("2019-02-04"), 76.87f),
        LineData(Time.StringTime("2019-02-05"), 77.15f),
        LineData(Time.StringTime("2019-02-06"), 77.39f),
        LineData(Time.StringTime("2019-02-07"), 76.82f),
        LineData(Time.StringTime("2019-02-08"), 77.52f),
        LineData(Time.StringTime("2019-02-11"), 76.71f),
        LineData(Time.StringTime("2019-02-12"), 78.52f),
        LineData(Time.StringTime("2019-02-13"), 79.02f),
        LineData(Time.StringTime("2019-02-14"), 78.94f),
        LineData(Time.StringTime("2019-02-15"), 79.81f),
        LineData(Time.StringTime("2019-02-19"), 79.24f),
        LineData(Time.StringTime("2019-02-20"), 79.43f),
        LineData(Time.StringTime("2019-02-21"), 79.83f),
        LineData(Time.StringTime("2019-02-22"), 80.77f),
        LineData(Time.StringTime("2019-02-25"), 80.38f),
        LineData(Time.StringTime("2019-02-26"), 80.74f),
        LineData(Time.StringTime("2019-02-27"), 80.62f),
        LineData(Time.StringTime("2019-02-28"), 81.29f),
        LineData(Time.StringTime("2019-03-01"), 81.65f),
        LineData(Time.StringTime("2019-03-04"), 81.37f),
        LineData(Time.StringTime("2019-03-05"), 81.70f),
        LineData(Time.StringTime("2019-03-06"), 80.76f),
        LineData(Time.StringTime("2019-03-07"), 80.45f),
        LineData(Time.StringTime("2019-03-08"), 79.80f),
        LineData(Time.StringTime("2019-03-11"), 80.87f),
        LineData(Time.StringTime("2019-03-12"), 81.23f),
        LineData(Time.StringTime("2019-03-13"), 81.60f),
        LineData(Time.StringTime("2019-03-14"), 81.49f),
        LineData(Time.StringTime("2019-03-15"), 81.57f),
        LineData(Time.StringTime("2019-03-18"), 81.35f),
        LineData(Time.StringTime("2019-03-19"), 81.91f),
        LineData(Time.StringTime("2019-03-20"), 82.08f),
        LineData(Time.StringTime("2019-03-21"), 82.95f),
        LineData(Time.StringTime("2019-03-22"), 82.29f),
        LineData(Time.StringTime("2019-03-25"), 82.35f),
        LineData(Time.StringTime("2019-03-26"), 82.92f),
        LineData(Time.StringTime("2019-03-27"), 82.29f),
        LineData(Time.StringTime("2019-03-28"), 82.63f),
        LineData(Time.StringTime("2019-03-29"), 83.17f),
        LineData(Time.StringTime("2019-04-01"), 83.30f),
        LineData(Time.StringTime("2019-04-02"), 83.21f),
        LineData(Time.StringTime("2019-04-03"), 83.18f),
        LineData(Time.StringTime("2019-04-04"), 81.85f),
        LineData(Time.StringTime("2019-04-05"), 81.15f),
        LineData(Time.StringTime("2019-04-08"), 80.95f),
        LineData(Time.StringTime("2019-04-09"), 80.80f),
        LineData(Time.StringTime("2019-04-10"), 80.82f),
        LineData(Time.StringTime("2019-04-11"), 79.84f),
        LineData(Time.StringTime("2019-04-12"), 79.43f),
        LineData(Time.StringTime("2019-04-15"), 78.53f),
        LineData(Time.StringTime("2019-04-16"), 77.56f),
        LineData(Time.StringTime("2019-04-17"), 73.92f),
        LineData(Time.StringTime("2019-04-18"), 73.19f),
        LineData(Time.StringTime("2019-04-22"), 73.46f),
        LineData(Time.StringTime("2019-04-23"), 74.60f),
        LineData(Time.StringTime("2019-04-24"), 74.73f),
        LineData(Time.StringTime("2019-04-25"), 76.34f),
        LineData(Time.StringTime("2019-04-26"), 76.63f),
        LineData(Time.StringTime("2019-04-29"), 76.78f),
        LineData(Time.StringTime("2019-04-30"), 78.71f),
        LineData(Time.StringTime("2019-05-01"), 78.72f),
        LineData(Time.StringTime("2019-05-02"), 79.52f),
        LineData(Time.StringTime("2019-05-03"), 80.00f),
        LineData(Time.StringTime("2019-05-06"), 79.48f),
        LineData(Time.StringTime("2019-05-07"), 77.90f),
        LineData(Time.StringTime("2019-05-08"), 78.18f),
        LineData(Time.StringTime("2019-05-09"), 78.33f),
        LineData(Time.StringTime("2019-05-10"), 78.19f),
        LineData(Time.StringTime("2019-05-13"), 77.17f),
        LineData(Time.StringTime("2019-05-14"), 77.42f),
        LineData(Time.StringTime("2019-05-15"), 77.55f),
        LineData(Time.StringTime("2019-05-16"), 79.13f),
        LineData(Time.StringTime("2019-05-17"), 78.72f),
        LineData(Time.StringTime("2019-05-20"), 78.88f),
        LineData(Time.StringTime("2019-05-21"), 79.50f),
        LineData(Time.StringTime("2019-05-22"), 80.98f),
        LineData(Time.StringTime("2019-05-23"), 81.02f),
        LineData(Time.StringTime("2019-05-24"), 81.17f),
        LineData(Time.StringTime("2019-05-28"), 81.10f)
    )
}

@Suppress("LongMethod")
fun listCustomThemesSeriesLineData(): MutableList<SeriesData> {
    return mutableListOf(
        LineData(Time.StringTime("2018-10-19"), 35.98f),
        LineData(Time.StringTime("2018-10-22"), 35.75f),
        LineData(Time.StringTime("2018-10-23"), 35.65f),
        LineData(Time.StringTime("2018-10-24"), 34.12f),
        LineData(Time.StringTime("2018-10-25"), 35.84f),
        LineData(Time.StringTime("2018-10-26"), 35.24f),
        LineData(Time.StringTime("2018-10-29"), 35.99f),
        LineData(Time.StringTime("2018-10-30"), 37.71f),
        LineData(Time.StringTime("2018-10-31"), 38.14f),
        LineData(Time.StringTime("2018-11-01"), 37.95f),
        LineData(Time.StringTime("2018-11-02"), 37.66f),
        LineData(Time.StringTime("2018-11-05"), 38.02f),
        LineData(Time.StringTime("2018-11-06"), 37.73f),
        LineData(Time.StringTime("2018-11-07"), 38.30f),
        LineData(Time.StringTime("2018-11-08"), 38.30f),
        LineData(Time.StringTime("2018-11-09"), 38.34f),
        LineData(Time.StringTime("2018-11-12"), 38.00f),
        LineData(Time.StringTime("2018-11-13"), 37.72f),
        LineData(Time.StringTime("2018-11-14"), 38.29f),
        LineData(Time.StringTime("2018-11-15"), 38.49f),
        LineData(Time.StringTime("2018-11-16"), 38.59f),
        LineData(Time.StringTime("2018-11-19"), 38.18f),
        LineData(Time.StringTime("2018-11-20"), 36.76f),
        LineData(Time.StringTime("2018-11-21"), 37.51f),
        LineData(Time.StringTime("2018-11-23"), 37.39f),
        LineData(Time.StringTime("2018-11-26"), 37.77f),
        LineData(Time.StringTime("2018-11-27"), 38.36f),
        LineData(Time.StringTime("2018-11-28"), 39.06f),
        LineData(Time.StringTime("2018-11-29"), 39.42f),
        LineData(Time.StringTime("2018-11-30"), 39.01f),
        LineData(Time.StringTime("2018-12-03"), 39.15f),
        LineData(Time.StringTime("2018-12-04"), 37.69f),
        LineData(Time.StringTime("2018-12-06"), 37.88f),
        LineData(Time.StringTime("2018-12-07"), 37.41f),
        LineData(Time.StringTime("2018-12-10"), 37.35f),
        LineData(Time.StringTime("2018-12-11"), 36.84f),
        LineData(Time.StringTime("2018-12-12"), 36.98f),
        LineData(Time.StringTime("2018-12-13"), 36.76f),
        LineData(Time.StringTime("2018-12-14"), 36.34f),
        LineData(Time.StringTime("2018-12-17"), 36.21f),
        LineData(Time.StringTime("2018-12-18"), 35.65f),
        LineData(Time.StringTime("2018-12-19"), 35.19f),
        LineData(Time.StringTime("2018-12-20"), 34.62f),
        LineData(Time.StringTime("2018-12-21"), 33.75f),
        LineData(Time.StringTime("2018-12-24"), 33.07f),
        LineData(Time.StringTime("2018-12-26"), 34.14f),
        LineData(Time.StringTime("2018-12-27"), 34.47f),
        LineData(Time.StringTime("2018-12-28"), 34.35f),
        LineData(Time.StringTime("2018-12-31"), 34.05f),
        LineData(Time.StringTime("2019-01-02"), 34.37f),
        LineData(Time.StringTime("2019-01-03"), 34.64f),
        LineData(Time.StringTime("2019-01-04"), 35.81f),
        LineData(Time.StringTime("2019-01-07"), 35.43f),
        LineData(Time.StringTime("2019-01-08"), 35.72f),
        LineData(Time.StringTime("2019-01-09"), 36.06f),
        LineData(Time.StringTime("2019-01-10"), 35.82f),
        LineData(Time.StringTime("2019-01-11"), 35.63f),
        LineData(Time.StringTime("2019-01-14"), 35.77f),
        LineData(Time.StringTime("2019-01-15"), 35.83f),
        LineData(Time.StringTime("2019-01-16"), 35.90f),
        LineData(Time.StringTime("2019-01-17"), 35.91f),
        LineData(Time.StringTime("2019-01-18"), 36.21f),
        LineData(Time.StringTime("2019-01-22"), 34.97f),
        LineData(Time.StringTime("2019-01-23"), 36.89f),
        LineData(Time.StringTime("2019-01-24"), 36.24f),
        LineData(Time.StringTime("2019-01-25"), 35.78f),
        LineData(Time.StringTime("2019-01-28"), 35.37f),
        LineData(Time.StringTime("2019-01-29"), 36.08f),
        LineData(Time.StringTime("2019-01-30"), 35.43f),
        LineData(Time.StringTime("2019-01-31"), 36.57f),
        LineData(Time.StringTime("2019-02-01"), 36.79f),
        LineData(Time.StringTime("2019-02-04"), 36.77f),
        LineData(Time.StringTime("2019-02-05"), 37.15f),
        LineData(Time.StringTime("2019-02-06"), 37.17f),
        LineData(Time.StringTime("2019-02-07"), 37.68f),
        LineData(Time.StringTime("2019-02-08"), 37.60f),
        LineData(Time.StringTime("2019-02-11"), 37.00f),
        LineData(Time.StringTime("2019-02-12"), 37.24f),
        LineData(Time.StringTime("2019-02-13"), 37.03f),
        LineData(Time.StringTime("2019-02-14"), 37.26f),
        LineData(Time.StringTime("2019-02-15"), 37.77f),
        LineData(Time.StringTime("2019-02-19"), 37.55f),
        LineData(Time.StringTime("2019-02-20"), 37.79f),
        LineData(Time.StringTime("2019-02-21"), 38.47f),
        LineData(Time.StringTime("2019-02-22"), 38.61f),
        LineData(Time.StringTime("2019-02-25"), 38.57f),
        LineData(Time.StringTime("2019-02-26"), 38.80f),
        LineData(Time.StringTime("2019-02-27"), 38.53f),
        LineData(Time.StringTime("2019-02-28"), 38.67f),
        LineData(Time.StringTime("2019-03-01"), 39.10f),
        LineData(Time.StringTime("2019-03-04"), 38.73f),
        LineData(Time.StringTime("2019-03-05"), 38.72f),
        LineData(Time.StringTime("2019-03-06"), 38.61f),
        LineData(Time.StringTime("2019-03-07"), 38.38f),
        LineData(Time.StringTime("2019-03-08"), 38.19f),
        LineData(Time.StringTime("2019-03-11"), 39.17f),
        LineData(Time.StringTime("2019-03-12"), 39.49f),
        LineData(Time.StringTime("2019-03-13"), 39.56f),
        LineData(Time.StringTime("2019-03-14"), 39.87f),
        LineData(Time.StringTime("2019-03-15"), 40.47f),
        LineData(Time.StringTime("2019-03-18"), 39.92f),
        LineData(Time.StringTime("2019-03-19"), 39.78f),
        LineData(Time.StringTime("2019-03-20"), 39.47f),
        LineData(Time.StringTime("2019-03-21"), 40.05f),
        LineData(Time.StringTime("2019-03-22"), 39.46f),
        LineData(Time.StringTime("2019-03-25"), 39.18f),
        LineData(Time.StringTime("2019-03-26"), 39.63f),
        LineData(Time.StringTime("2019-03-27"), 40.21f),
        LineData(Time.StringTime("2019-03-28"), 40.42f),
        LineData(Time.StringTime("2019-03-29"), 39.98f),
        LineData(Time.StringTime("2019-04-01"), 40.31f),
        LineData(Time.StringTime("2019-04-02"), 40.02f),
        LineData(Time.StringTime("2019-04-03"), 40.27f),
        LineData(Time.StringTime("2019-04-04"), 40.41f),
        LineData(Time.StringTime("2019-04-05"), 40.42f),
        LineData(Time.StringTime("2019-04-08"), 40.71f),
        LineData(Time.StringTime("2019-04-09"), 41.04f),
        LineData(Time.StringTime("2019-04-10"), 41.08f),
        LineData(Time.StringTime("2019-04-11"), 41.04f),
        LineData(Time.StringTime("2019-04-12"), 41.30f),
        LineData(Time.StringTime("2019-04-15"), 41.78f),
        LineData(Time.StringTime("2019-04-16"), 41.97f),
        LineData(Time.StringTime("2019-04-17"), 42.57f),
        LineData(Time.StringTime("2019-04-18"), 42.43f),
        LineData(Time.StringTime("2019-04-22"), 42.00f),
        LineData(Time.StringTime("2019-04-23"), 41.99f),
        LineData(Time.StringTime("2019-04-24"), 41.85f),
        LineData(Time.StringTime("2019-04-25"), 42.93f),
        LineData(Time.StringTime("2019-04-26"), 43.08f),
        LineData(Time.StringTime("2019-04-29"), 43.45f),
        LineData(Time.StringTime("2019-04-30"), 43.53f),
        LineData(Time.StringTime("2019-05-01"), 43.42f),
        LineData(Time.StringTime("2019-05-02"), 42.65f),
        LineData(Time.StringTime("2019-05-03"), 43.29f),
        LineData(Time.StringTime("2019-05-06"), 43.30f),
        LineData(Time.StringTime("2019-05-07"), 42.76f),
        LineData(Time.StringTime("2019-05-08"), 42.55f),
        LineData(Time.StringTime("2019-05-09"), 42.92f),
        LineData(Time.StringTime("2019-05-10"), 43.15f),
        LineData(Time.StringTime("2019-05-13"), 42.28f),
        LineData(Time.StringTime("2019-05-14"), 42.91f),
        LineData(Time.StringTime("2019-05-15"), 42.49f),
        LineData(Time.StringTime("2019-05-16"), 43.19f),
        LineData(Time.StringTime("2019-05-17"), 43.54f),
        LineData(Time.StringTime("2019-05-20"), 42.78f),
        LineData(Time.StringTime("2019-05-21"), 43.29f),
        LineData(Time.StringTime("2019-05-22"), 43.30f),
        LineData(Time.StringTime("2019-05-23"), 42.73f),
        LineData(Time.StringTime("2019-05-24"), 42.67f),
        LineData(Time.StringTime("2019-05-28"), 42.75f)
    )
}

@Suppress("LongMethod")
fun listFloatingTooltipSeriesLineData(): MutableList<SeriesData> {
    return mutableListOf(
        LineData(Time.StringTime("2018-03-28"), 154f),
        LineData(Time.StringTime("2018-03-29"), 154.2f),
        LineData(Time.StringTime("2018-03-30"), 155.60001f),
        LineData(Time.StringTime("2018-04-02"), 156.25f),
        LineData(Time.StringTime("2018-04-03"), 156.25f),
        LineData(Time.StringTime("2018-04-04"), 156.05f),
        LineData(Time.StringTime("2018-04-05"), 158.05f),
        LineData(Time.StringTime("2018-04-06"), 157.3f),
        LineData(Time.StringTime("2018-04-09"), 144f),
        LineData(Time.StringTime("2018-04-10"), 144.8f),
        LineData(Time.StringTime("2018-04-11"), 143.5f),
        LineData(Time.StringTime("2018-04-12"), 147.05f),
        LineData(Time.StringTime("2018-04-13"), 144.85001f),
        LineData(Time.StringTime("2018-04-16"), 145.39999f),
        LineData(Time.StringTime("2018-04-17"), 147.3f),
        LineData(Time.StringTime("2018-04-18"), 153.55f),
        LineData(Time.StringTime("2018-04-19"), 150.95f),
        LineData(Time.StringTime("2018-04-20"), 149.39999f),
        LineData(Time.StringTime("2018-04-23"), 148.5f),
        LineData(Time.StringTime("2018-04-24"), 146.60001f),
        LineData(Time.StringTime("2018-04-25"), 144.45f),
        LineData(Time.StringTime("2018-04-26"), 145.60001f),
        LineData(Time.StringTime("2018-04-27"), 144.3f),
        LineData(Time.StringTime("2018-04-30"), 144f),
        LineData(Time.StringTime("2018-05-02"), 147.3f),
        LineData(Time.StringTime("2018-05-03"), 144.2f),
        LineData(Time.StringTime("2018-05-04"), 141.64999f),
        LineData(Time.StringTime("2018-05-07"), 141.89999f),
        LineData(Time.StringTime("2018-05-08"), 140.39999f),
        LineData(Time.StringTime("2018-05-10"), 139.8f),
        LineData(Time.StringTime("2018-05-11"), 137.5f),
        LineData(Time.StringTime("2018-05-14"), 136.14999f),
        LineData(Time.StringTime("2018-05-15"), 138f),
        LineData(Time.StringTime("2018-05-16"), 137.95f),
        LineData(Time.StringTime("2018-05-17"), 137.95f),
        LineData(Time.StringTime("2018-05-18"), 136.75f),
        LineData(Time.StringTime("2018-05-21"), 136.2f),
        LineData(Time.StringTime("2018-05-22"), 135f),
        LineData(Time.StringTime("2018-05-23"), 132.55f),
        LineData(Time.StringTime("2018-05-24"), 132.7f),
        LineData(Time.StringTime("2018-05-25"), 132.2f),
        LineData(Time.StringTime("2018-05-28"), 131.55f),
        LineData(Time.StringTime("2018-05-29"), 131.85001f),
        LineData(Time.StringTime("2018-05-30"), 139.85001f),
        LineData(Time.StringTime("2018-05-31"), 140.8f),
        LineData(Time.StringTime("2018-06-01"), 139.64999f),
        LineData(Time.StringTime("2018-06-04"), 137.10001f),
        LineData(Time.StringTime("2018-06-05"), 139.25f),
        LineData(Time.StringTime("2018-06-06"), 141.3f),
        LineData(Time.StringTime("2018-06-07"), 145f),
        LineData(Time.StringTime("2018-06-08"), 143.89999f),
        LineData(Time.StringTime("2018-06-11"), 142.7f),
        LineData(Time.StringTime("2018-06-13"), 144.05f),
        LineData(Time.StringTime("2018-06-14"), 143.55f),
        LineData(Time.StringTime("2018-06-15"), 140.5f),
        LineData(Time.StringTime("2018-06-18"), 139.64999f),
        LineData(Time.StringTime("2018-06-19"), 138f),
        LineData(Time.StringTime("2018-06-20"), 141f),
        LineData(Time.StringTime("2018-06-21"), 140.55f),
        LineData(Time.StringTime("2018-06-22"), 140.55f),
        LineData(Time.StringTime("2018-06-25"), 140.75f),
        LineData(Time.StringTime("2018-06-26"), 140.64999f),
        LineData(Time.StringTime("2018-06-27"), 141.14999f),
        LineData(Time.StringTime("2018-06-28"), 139.8f),
        LineData(Time.StringTime("2018-06-29"), 139.8f),
        LineData(Time.StringTime("2018-07-02"), 140.14999f),
        LineData(Time.StringTime("2018-07-03"), 143.05f),
        LineData(Time.StringTime("2018-07-04"), 140f),
        LineData(Time.StringTime("2018-07-05"), 129.2f),
        LineData(Time.StringTime("2018-07-06"), 129.55f),
        LineData(Time.StringTime("2018-07-09"), 128.3f),
        LineData(Time.StringTime("2018-07-10"), 126.55f),
        LineData(Time.StringTime("2018-07-11"), 124.3f),
        LineData(Time.StringTime("2018-07-12"), 124.8f),
        LineData(Time.StringTime("2018-07-13"), 123.25f),
        LineData(Time.StringTime("2018-07-16"), 123f),
        LineData(Time.StringTime("2018-07-17"), 124.25f),
        LineData(Time.StringTime("2018-07-18"), 123f),
        LineData(Time.StringTime("2018-07-19"), 121f),
        LineData(Time.StringTime("2018-07-20"), 121.45f),
        LineData(Time.StringTime("2018-07-23"), 123.8f),
        LineData(Time.StringTime("2018-07-24"), 122.15f),
        LineData(Time.StringTime("2018-07-25"), 121.3f),
        LineData(Time.StringTime("2018-07-26"), 122.7f),
        LineData(Time.StringTime("2018-07-27"), 122.2f),
        LineData(Time.StringTime("2018-07-30"), 121.7f),
        LineData(Time.StringTime("2018-07-31"), 122.95f),
        LineData(Time.StringTime("2018-08-01"), 121f),
        LineData(Time.StringTime("2018-08-02"), 116f),
        LineData(Time.StringTime("2018-08-03"), 118.1f),
        LineData(Time.StringTime("2018-08-06"), 114.3f),
        LineData(Time.StringTime("2018-08-07"), 114.25f),
        LineData(Time.StringTime("2018-08-08"), 111.85f),
        LineData(Time.StringTime("2018-08-09"), 109.7f),
        LineData(Time.StringTime("2018-08-10"), 105f),
        LineData(Time.StringTime("2018-08-13"), 105.75f),
        LineData(Time.StringTime("2018-08-14"), 107.25f),
        LineData(Time.StringTime("2018-08-15"), 107.4f),
        LineData(Time.StringTime("2018-08-16"), 110.5f),
        LineData(Time.StringTime("2018-08-17"), 109f),
        LineData(Time.StringTime("2018-08-20"), 108.95f),
        LineData(Time.StringTime("2018-08-21"), 108.35f),
        LineData(Time.StringTime("2018-08-22"), 108.6f),
        LineData(Time.StringTime("2018-08-23"), 105.65f),
        LineData(Time.StringTime("2018-08-24"), 104.45f),
        LineData(Time.StringTime("2018-08-27"), 106.2f),
        LineData(Time.StringTime("2018-08-28"), 106.55f),
        LineData(Time.StringTime("2018-08-29"), 111.8f),
        LineData(Time.StringTime("2018-08-30"), 115.5f),
        LineData(Time.StringTime("2018-08-31"), 115.5f),
        LineData(Time.StringTime("2018-09-03"), 114.55f),
        LineData(Time.StringTime("2018-09-04"), 112.75f),
        LineData(Time.StringTime("2018-09-05"), 111.5f),
        LineData(Time.StringTime("2018-09-06"), 108.1f),
        LineData(Time.StringTime("2018-09-07"), 108.55f),
        LineData(Time.StringTime("2018-09-10"), 106.5f),
        LineData(Time.StringTime("2018-09-11"), 105.1f),
        LineData(Time.StringTime("2018-09-12"), 107.2f),
        LineData(Time.StringTime("2018-09-13"), 107.1f),
        LineData(Time.StringTime("2018-09-14"), 105.75f),
        LineData(Time.StringTime("2018-09-17"), 106.05f),
        LineData(Time.StringTime("2018-09-18"), 109.15f),
        LineData(Time.StringTime("2018-09-19"), 111.4f),
        LineData(Time.StringTime("2018-09-20"), 111f),
        LineData(Time.StringTime("2018-09-21"), 111f),
        LineData(Time.StringTime("2018-09-24"), 108.95f),
        LineData(Time.StringTime("2018-09-25"), 106.65f),
        LineData(Time.StringTime("2018-09-26"), 106.7f),
        LineData(Time.StringTime("2018-09-27"), 107.05f),
        LineData(Time.StringTime("2018-09-28"), 106.55f),
        LineData(Time.StringTime("2018-10-01"), 106.2f),
        LineData(Time.StringTime("2018-10-02"), 106.4f),
        LineData(Time.StringTime("2018-10-03"), 107.1f),
        LineData(Time.StringTime("2018-10-04"), 106.4f),
        LineData(Time.StringTime("2018-10-05"), 104.65f),
        LineData(Time.StringTime("2018-10-08"), 102.65f),
        LineData(Time.StringTime("2018-10-09"), 102.1f),
        LineData(Time.StringTime("2018-10-10"), 102.15f),
        LineData(Time.StringTime("2018-10-11"), 100.9f),
        LineData(Time.StringTime("2018-10-12"), 102f),
        LineData(Time.StringTime("2018-10-15"), 100.15f),
        LineData(Time.StringTime("2018-10-16"), 99f),
        LineData(Time.StringTime("2018-10-17"), 98f),
        LineData(Time.StringTime("2018-10-18"), 96f),
        LineData(Time.StringTime("2018-10-19"), 95.5f),
        LineData(Time.StringTime("2018-10-22"), 92.400002f),
        LineData(Time.StringTime("2018-10-23"), 92.300003f),
        LineData(Time.StringTime("2018-10-24"), 92.900002f),
        LineData(Time.StringTime("2018-10-25"), 91.849998f),
        LineData(Time.StringTime("2018-10-26"), 91.599998f),
        LineData(Time.StringTime("2018-10-29"), 94.050003f),
        LineData(Time.StringTime("2018-10-30"), 98.25f),
        LineData(Time.StringTime("2018-10-31"), 97.25f),
        LineData(Time.StringTime("2018-11-01"), 96.879997f),
        LineData(Time.StringTime("2018-11-02"), 101.78f),
        LineData(Time.StringTime("2018-11-06"), 102.4f),
        LineData(Time.StringTime("2018-11-07"), 100.6f),
        LineData(Time.StringTime("2018-11-08"), 98.5f),
        LineData(Time.StringTime("2018-11-09"), 95.139999f),
        LineData(Time.StringTime("2018-11-12"), 96.900002f),
        LineData(Time.StringTime("2018-11-13"), 97.400002f),
        LineData(Time.StringTime("2018-11-14"), 103.3f),
        LineData(Time.StringTime("2018-11-15"), 102.74f),
        LineData(Time.StringTime("2018-11-16"), 101.2f),
        LineData(Time.StringTime("2018-11-19"), 98.720001f),
        LineData(Time.StringTime("2018-11-20"), 102.2f),
        LineData(Time.StringTime("2018-11-21"), 108.8f),
        LineData(Time.StringTime("2018-11-22"), 109.9f),
        LineData(Time.StringTime("2018-11-23"), 113.74f),
        LineData(Time.StringTime("2018-11-26"), 110.9f),
        LineData(Time.StringTime("2018-11-27"), 113.28f),
        LineData(Time.StringTime("2018-11-28"), 113.6f),
        LineData(Time.StringTime("2018-11-29"), 113.14f),
        LineData(Time.StringTime("2018-11-30"), 114.4f),
        LineData(Time.StringTime("2018-12-03"), 111.84f),
        LineData(Time.StringTime("2018-12-04"), 106.7f),
        LineData(Time.StringTime("2018-12-05"), 107.8f),
        LineData(Time.StringTime("2018-12-06"), 106.44f),
        LineData(Time.StringTime("2018-12-07"), 103.7f),
        LineData(Time.StringTime("2018-12-10"), 101.02f),
        LineData(Time.StringTime("2018-12-11"), 102.72f),
        LineData(Time.StringTime("2018-12-12"), 101.8f),
        LineData(Time.StringTime("2018-12-13"), 102f),
        LineData(Time.StringTime("2018-12-14"), 102.1f),
        LineData(Time.StringTime("2018-12-17"), 101.04f),
        LineData(Time.StringTime("2018-12-18"), 101.6f),
        LineData(Time.StringTime("2018-12-19"), 102f),
        LineData(Time.StringTime("2018-12-20"), 102.02f),
        LineData(Time.StringTime("2018-12-21"), 102.2f),
        LineData(Time.StringTime("2018-12-24"), 102.1f),
        LineData(Time.StringTime("2018-12-25"), 100.8f),
        LineData(Time.StringTime("2018-12-26"), 101.02f),
        LineData(Time.StringTime("2018-12-27"), 100.5f),
        LineData(Time.StringTime("2018-12-28"), 101f),
        LineData(Time.StringTime("2019-01-03"), 101.5f),
        LineData(Time.StringTime("2019-01-04"), 101.1f),
        LineData(Time.StringTime("2019-01-08"), 101.1f),
        LineData(Time.StringTime("2019-01-09"), 102.06f),
        LineData(Time.StringTime("2019-01-10"), 105.14f),
        LineData(Time.StringTime("2019-01-11"), 104.66f),
        LineData(Time.StringTime("2019-01-14"), 106.22f),
        LineData(Time.StringTime("2019-01-15"), 106.98f),
        LineData(Time.StringTime("2019-01-16"), 108.4f),
        LineData(Time.StringTime("2019-01-17"), 109.06f),
        LineData(Time.StringTime("2019-01-18"), 107f),
        LineData(Time.StringTime("2019-01-21"), 105.8f),
        LineData(Time.StringTime("2019-01-22"), 105.24f),
        LineData(Time.StringTime("2019-01-23"), 105.4f),
        LineData(Time.StringTime("2019-01-24"), 105.38f),
        LineData(Time.StringTime("2019-01-25"), 105.7f),
        LineData(Time.StringTime("2019-01-28"), 105.8f),
        LineData(Time.StringTime("2019-01-29"), 106.1f),
        LineData(Time.StringTime("2019-01-30"), 108.6f),
        LineData(Time.StringTime("2019-01-31"), 107.92f),
        LineData(Time.StringTime("2019-02-01"), 105.22f),
        LineData(Time.StringTime("2019-02-04"), 102.44f),
        LineData(Time.StringTime("2019-02-05"), 102.26f),
        LineData(Time.StringTime("2019-02-06"), 102f),
        LineData(Time.StringTime("2019-02-07"), 101.62f),
        LineData(Time.StringTime("2019-02-08"), 101.9f),
        LineData(Time.StringTime("2019-02-11"), 101.78f),
        LineData(Time.StringTime("2019-02-12"), 102.7f),
        LineData(Time.StringTime("2019-02-13"), 100.14f),
        LineData(Time.StringTime("2019-02-14"), 101.36f),
        LineData(Time.StringTime("2019-02-15"), 101.62f),
        LineData(Time.StringTime("2019-02-18"), 100.74f),
        LineData(Time.StringTime("2019-02-19"), 100f),
        LineData(Time.StringTime("2019-02-20"), 100.04f),
        LineData(Time.StringTime("2019-02-21"), 100f),
        LineData(Time.StringTime("2019-02-22"), 100.12f),
        LineData(Time.StringTime("2019-02-25"), 100.04f),
        LineData(Time.StringTime("2019-02-26"), 98.980003f),
        LineData(Time.StringTime("2019-02-27"), 97.699997f),
        LineData(Time.StringTime("2019-02-28"), 97.099998f),
        LineData(Time.StringTime("2019-03-01"), 96.760002f),
        LineData(Time.StringTime("2019-03-04"), 98.360001f),
        LineData(Time.StringTime("2019-03-05"), 96.260002f),
        LineData(Time.StringTime("2019-03-06"), 98.120003f),
        LineData(Time.StringTime("2019-03-07"), 99.68f),
        LineData(Time.StringTime("2019-03-11"), 102.1f),
        LineData(Time.StringTime("2019-03-12"), 100.22f),
        LineData(Time.StringTime("2019-03-13"), 100.5f),
        LineData(Time.StringTime("2019-03-14"), 99.660004f),
        LineData(Time.StringTime("2019-03-15"), 100.08f),
        LineData(Time.StringTime("2019-03-18"), 99.919998f),
        LineData(Time.StringTime("2019-03-19"), 99.459999f),
        LineData(Time.StringTime("2019-03-20"), 98.220001f),
        LineData(Time.StringTime("2019-03-21"), 97.300003f),
        LineData(Time.StringTime("2019-03-22"), 97.660004f),
        LineData(Time.StringTime("2019-03-25"), 97f),
        LineData(Time.StringTime("2019-03-26"), 97.019997f),
        LineData(Time.StringTime("2019-03-27"), 96.099998f),
        LineData(Time.StringTime("2019-03-28"), 96.699997f),
        LineData(Time.StringTime("2019-03-29"), 96.300003f),
        LineData(Time.StringTime("2019-04-01"), 97.779999f),
        LineData(Time.StringTime("2019-04-02"), 98.360001f),
        LineData(Time.StringTime("2019-04-03"), 98.5f),
        LineData(Time.StringTime("2019-04-04"), 98.360001f),
        LineData(Time.StringTime("2019-04-05"), 99.540001f),
        LineData(Time.StringTime("2019-04-08"), 98.580002f),
        LineData(Time.StringTime("2019-04-09"), 97.239998f),
        LineData(Time.StringTime("2019-04-10"), 97.32f),
        LineData(Time.StringTime("2019-04-11"), 98.400002f),
        LineData(Time.StringTime("2019-04-12"), 98.220001f),
        LineData(Time.StringTime("2019-04-15"), 98.720001f),
        LineData(Time.StringTime("2019-04-16"), 99.120003f),
        LineData(Time.StringTime("2019-04-17"), 98.620003f),
        LineData(Time.StringTime("2019-04-18"), 98f),
        LineData(Time.StringTime("2019-04-19"), 97.599998f),
        LineData(Time.StringTime("2019-04-22"), 97.599998f),
        LineData(Time.StringTime("2019-04-23"), 96.800003f),
        LineData(Time.StringTime("2019-04-24"), 96.32f),
        LineData(Time.StringTime("2019-04-25"), 96.339996f),
        LineData(Time.StringTime("2019-04-26"), 97.120003f),
        LineData(Time.StringTime("2019-04-29"), 96.980003f),
        LineData(Time.StringTime("2019-04-30"), 96.32f),
        LineData(Time.StringTime("2019-05-02"), 96.860001f),
        LineData(Time.StringTime("2019-05-03"), 96.699997f),
        LineData(Time.StringTime("2019-05-06"), 94.940002f),
        LineData(Time.StringTime("2019-05-07"), 94.5f),
        LineData(Time.StringTime("2019-05-08"), 94.239998f),
        LineData(Time.StringTime("2019-05-10"), 92.900002f),
        LineData(Time.StringTime("2019-05-13"), 91.279999f),
        LineData(Time.StringTime("2019-05-14"), 91.599998f),
        LineData(Time.StringTime("2019-05-15"), 90.080002f),
        LineData(Time.StringTime("2019-05-16"), 91.68f),
        LineData(Time.StringTime("2019-05-17"), 91.959999f),
        LineData(Time.StringTime("2019-05-20"), 91.080002f),
        LineData(Time.StringTime("2019-05-21"), 90.760002f),
        LineData(Time.StringTime("2019-05-22"), 91f),
        LineData(Time.StringTime("2019-05-23"), 90.739998f),
        LineData(Time.StringTime("2019-05-24"), 91f),
        LineData(Time.StringTime("2019-05-27"), 91.199997f),
        LineData(Time.StringTime("2019-05-28"), 90.68f),
        LineData(Time.StringTime("2019-05-29"), 91.120003f),
        LineData(Time.StringTime("2019-05-30"), 90.419998f),
        LineData(Time.StringTime("2019-05-31"), 93.800003f),
        LineData(Time.StringTime("2019-06-03"), 96.800003f),
        LineData(Time.StringTime("2019-06-04"), 96.34f),
        LineData(Time.StringTime("2019-06-05"), 95.94f)
    )
}

@Suppress("LongMethod")
fun listPriceLinesWithTitlesSeriesLineData(): MutableList<SeriesData> {
    return mutableListOf(
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 1), value = 27.58405298746434f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 2), value = 31.74088841431117f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 3), value = 35.892978753808926f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 4), value = 39.63642029045179f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 5), value = 40.79167357702531f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 6), value = 47.691740220947764f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 7), value = 49.377161099825415f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 8), value = 52.47379203136591f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 9), value = 50.40209743179448f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 10), value = 61.47316837848548f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 11), value = 58.22831552141069f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 12), value = 59.36868132891698f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 13), value = 62.10845687168416f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 14), value = 51.259701958506724f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 15), value = 56.247578870411644f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 16), value = 55.483307642385164f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 17), value = 55.85295564734231f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 18), value = 48.3138216778343f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 19), value = 53.071901176203866f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 20), value = 50.873781097281885f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 21), value = 49.7840315054249f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 22), value = 52.34956807336156f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 23), value = 53.79112543285674f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 24), value = 53.984887985424805f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 25), value = 58.56902893497121f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 26), value = 54.76191372282466f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 27), value = 63.38042554684846f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 28), value = 55.452618512103065f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 29), value = 65.60820758942769f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 30), value = 56.82795136583009f),
        LineData(Time.BusinessDay(year = 2018, month = 1, day = 31), value = 70.3148022984224f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 1), value = 65.86230944167264f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 2), value = 72.05467846676524f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 3), value = 72.99238887850564f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 4), value = 67.03373730222785f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 5), value = 69.97670934736414f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 6), value = 73.08910595492105f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 7), value = 81.43976528732057f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 8), value = 73.62230936920984f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 9), value = 82.15522801870938f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 10), value = 77.99384538574678f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 11), value = 85.62489628897463f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 12), value = 86.93090666568217f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 13), value = 75.99689788850394f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 14), value = 88.46418548355727f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 15), value = 86.20760396539865f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 16), value = 81.88757639758437f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 17), value = 79.58151786389108f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 18), value = 80.96845249711073f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 19), value = 73.54901807055447f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 20), value = 75.65626118347262f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 21), value = 78.41307347680399f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 22), value = 74.60352602043042f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 23), value = 72.28241570381236f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 24), value = 72.24427397962566f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 25), value = 64.80996965592134f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 26), value = 67.37511361319652f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 27), value = 65.5449131917524f),
        LineData(Time.BusinessDay(year = 2018, month = 2, day = 28), value = 65.4802711362433f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 1), value = 62.207767815581086f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 2), value = 59.78884720470812f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 3), value = 67.51846586137782f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 4), value = 68.752834400291f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 5), value = 66.63416073573323f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 6), value = 65.58601621691751f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 7), value = 57.33498792621458f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 8), value = 56.93436946311955f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 9), value = 58.31144672902557f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 10), value = 59.96407207657268f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 11), value = 55.7861486424976f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 12), value = 52.91803500214551f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 13), value = 54.491591573038306f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 14), value = 51.924409342593385f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 15), value = 41.90263950118436f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 16), value = 40.514436076485694f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 17), value = 41.065887666854486f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 18), value = 40.44445534031683f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 19), value = 42.13922977216152f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 20), value = 42.317162952084495f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 21), value = 39.02881877743751f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 22), value = 39.81917993955704f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 23), value = 36.753197056053374f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 24), value = 37.02203306330588f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 25), value = 36.36014042161194f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 26), value = 33.56275879100148f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 27), value = 34.39112540787079f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 28), value = 30.57170225544929f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 29), value = 33.56826040802756f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 30), value = 32.89895543218274f),
        LineData(Time.BusinessDay(year = 2018, month = 3, day = 31), value = 31.015658561825738f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 1), value = 33.189179815787455f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 2), value = 29.530756945582162f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 3), value = 29.250978140719916f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 4), value = 27.89635178919736f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 5), value = 26.995427160624686f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 6), value = 25.89631885043023f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 7), value = 28.71812492475548f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 8), value = 23.56476085365468f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 9), value = 23.8550787876547f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 10), value = 23.27046572075657f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 11), value = 25.73099630369951f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 12), value = 23.398760738394646f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 13), value = 22.97970501784193f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 14), value = 22.145587244500526f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 15), value = 20.622578956226192f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 16), value = 21.99297423796017f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 17), value = 20.756081302371527f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 18), value = 18.1983338834302f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 19), value = 16.419404563645198f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 20), value = 18.38192363882247f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 21), value = 17.41452255210322f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 22), value = 17.39866711593896f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 23), value = 14.859371316920733f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 24), value = 14.49488592297959f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 25), value = 14.183858665721397f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 26), value = 12.754187935636056f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 27), value = 14.467536059608742f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 28), value = 14.72962730689032f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 29), value = 16.591675981296518f),
        LineData(Time.BusinessDay(year = 2018, month = 4, day = 30), value = 17.560385679284135f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 1), value = 22.386250317504064f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 2), value = 23.697029442697385f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 3), value = 23.453148128592442f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 4), value = 23.164700105036882f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 5), value = 23.919034678006323f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 6), value = 25.18353870528509f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 7), value = 26.982824465076394f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 8), value = 29.122512185000712f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 9), value = 29.60160406576696f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 10), value = 30.845749384528016f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 11), value = 33.03296938636202f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 12), value = 33.784707082446104f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 13), value = 36.08545410406137f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 14), value = 36.80597815439238f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 15), value = 34.56062188644443f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 16), value = 36.52666657165473f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 17), value = 34.76705735297833f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 18), value = 39.01598033743525f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 19), value = 37.60979560604685f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 20), value = 42.403895121650436f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 21), value = 45.55998014298455f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 22), value = 39.76704752577289f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 23), value = 41.83196178430985f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 24), value = 46.99399105885453f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 25), value = 48.553566318637984f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 26), value = 48.918166891087594f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 27), value = 42.95391588314584f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 28), value = 51.267649950057546f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 29), value = 44.86104374986037f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 30), value = 46.7183564731453f),
        LineData(Time.BusinessDay(year = 2018, month = 5, day = 31), value = 52.753001379260766f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 1), value = 56.04835638442964f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 2), value = 54.82119793390652f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 3), value = 57.718938021257685f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 4), value = 53.9914459224653f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 5), value = 59.33050624063286f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 6), value = 50.79074268713266f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 7), value = 53.15657316197036f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 8), value = 59.43675134021954f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 9), value = 63.28437595760727f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 10), value = 58.07099287435428f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 11), value = 56.68728978119396f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 12), value = 57.05079700873323f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 13), value = 65.65087785161663f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 14), value = 59.20877581396441f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 15), value = 64.30200099280857f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 16), value = 68.60774992100288f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 17), value = 67.16628680993453f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 18), value = 62.89644591741811f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 19), value = 61.42888198118138f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 20), value = 64.89813095653885f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 21), value = 72.72701573552945f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 22), value = 67.85006296129148f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 23), value = 74.8567814889f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 24), value = 66.24228046316296f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 25), value = 68.09192660329269f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 26), value = 75.30075953672075f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 27), value = 68.7478054620306f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 28), value = 76.2285023801364f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 29), value = 82.945167109736f),
        LineData(Time.BusinessDay(year = 2018, month = 6, day = 30), value = 76.91811779365663f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 1), value = 73.4904875247808f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 2), value = 78.37882382739707f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 3), value = 77.00224598364632f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 4), value = 74.96345662377028f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 5), value = 85.54303380001907f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 6), value = 74.23916926437794f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 7), value = 86.38109732705232f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 8), value = 88.36203657839357f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 9), value = 81.63303116061893f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 10), value = 78.05188105610182f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 11), value = 93.73294498110195f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 12), value = 86.3226018109303f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 13), value = 83.18571530136985f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 14), value = 92.45097319531271f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 15), value = 82.61971871486392f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 16), value = 84.39935112744469f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 17), value = 86.84420907417798f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 18), value = 81.50766784637338f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 19), value = 88.74841709228694f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 20), value = 85.84190975050336f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 21), value = 86.9594938103096f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 22), value = 83.72572564120199f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 23), value = 83.42754326770913f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 24), value = 80.40755818165856f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 25), value = 81.40515523172276f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 26), value = 88.6671912474792f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 27), value = 83.98197434091429f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 28), value = 79.93747419607003f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 29), value = 88.74666581089701f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 30), value = 88.4887222568271f),
        LineData(Time.BusinessDay(year = 2018, month = 7, day = 31), value = 91.70282162754224f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 1), value = 81.82327312829118f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 2), value = 89.56625546634567f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 3), value = 83.60742160062637f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 4), value = 92.16271144958857f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 5), value = 92.93451790057534f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 6), value = 97.10629615852636f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 7), value = 93.18989484413193f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 8), value = 99.52744238602173f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 9), value = 90.84973685659028f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 10), value = 98.37517814040118f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 11), value = 90.13525425607658f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 12), value = 95.55125798221395f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 13), value = 82.77346455876308f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 14), value = 83.24854499361042f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 15), value = 95.41999231944423f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 16), value = 93.80228527345439f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 17), value = 95.6453232668047f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 18), value = 85.15427147925779f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 19), value = 84.96447951638784f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 20), value = 95.92739640648459f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 21), value = 96.44143870862634f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 22), value = 101.23323393804354f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 23), value = 92.12092707164649f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 24), value = 101.74117610271144f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 25), value = 96.38311956379351f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 26), value = 98.18485692799554f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 27), value = 102.60080903938159f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 28), value = 97.48394132428021f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 29), value = 101.41501247525068f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 30), value = 94.9501205245301f),
        LineData(Time.BusinessDay(year = 2018, month = 8, day = 31), value = 89.11429564465982f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 1), value = 104.1842141132897f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 2), value = 97.36185743859737f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 3), value = 97.34376526297034f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 4), value = 103.73609636859413f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 5), value = 86.89420264148593f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 6), value = 90.99445484839778f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 7), value = 92.0197876339847f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 8), value = 87.35412911434453f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 9), value = 97.40224787139312f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 10), value = 98.14732375673768f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 11), value = 101.5147062059064f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 12), value = 93.11950437404803f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 13), value = 98.41765784798642f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 14), value = 89.08499357950659f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 15), value = 96.29213559344964f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 16), value = 103.57528341068684f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 17), value = 98.94258099235431f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 18), value = 92.43383394007822f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 19), value = 105.39681697822706f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 20), value = 100.52663985092036f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 21), value = 98.84754340440189f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 22), value = 93.78502517034752f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 23), value = 95.51435402626828f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 24), value = 91.94633821567461f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 25), value = 98.18484857755837f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 26), value = 102.51694320185617f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 27), value = 97.40549024974396f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 28), value = 103.49718807374374f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 29), value = 108.24441490057781f),
        LineData(Time.BusinessDay(year = 2018, month = 9, day = 30), value = 103.24675412744978f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 1), value = 97.05089568637521f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 2), value = 91.85875309835458f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 3), value = 72.24590653541385f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 4), value = 70.73707674373722f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 5), value = 61.2106378263602f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 6), value = 62.35889407826063f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 7), value = 56.311930696659f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 8), value = 51.462743547904374f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 9), value = 47.99928302521288f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 10), value = 42.735011616511976f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 11), value = 35.82291867003256f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 12), value = 28.706141122035454f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 13), value = 24.289344698634036f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 14), value = 22.56513000253429f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 15), value = 18.862530899060324f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 16), value = 18.164416367748263f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 17), value = 16.25993836760582f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 18), value = 15.849033589978859f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 19), value = 12.581184324950792f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 20), value = 12.46960767886934f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 21), value = 13.203284995561251f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 22), value = 12.751819244602629f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 23), value = 13.815126496529205f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 24), value = 14.44156419046133f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 25), value = 12.030505290672643f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 26), value = 13.426535837756518f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 27), value = 13.141003741491893f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 28), value = 12.216411608284261f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 29), value = 12.437867813477077f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 30), value = 12.228521667932771f),
        LineData(Time.BusinessDay(year = 2018, month = 10, day = 31), value = 13.587126038913974f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 1), value = 12.016792589137491f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 2), value = 13.01948020515645f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 3), value = 12.70475528902004f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 4), value = 13.018454073452016f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 5), value = 12.505487262036313f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 6), value = 13.467522897553604f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 7), value = 13.748796553616549f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 8), value = 11.974873751121669f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 9), value = 11.8316362912944f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 10), value = 13.864291857325023f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 11), value = 12.071675684436165f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 12), value = 12.314581956701367f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 13), value = 13.223445358310986f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 14), value = 12.346191421746546f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 15), value = 12.0232072259563f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 16), value = 13.367039701380252f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 17), value = 12.232635114201212f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 18), value = 13.348220671014012f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 19), value = 13.508314659502604f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 20), value = 12.630893498655155f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 21), value = 12.632952849963768f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 22), value = 11.645073051089117f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 23), value = 13.845637677048611f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 24), value = 12.567519871595463f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 25), value = 13.927270152127294f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 26), value = 12.179362670863737f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 27), value = 12.471835488646303f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 28), value = 11.71761488042106f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 29), value = 12.181312973409113f),
        LineData(Time.BusinessDay(year = 2018, month = 11, day = 30), value = 12.662272671374286f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 1), value = 13.859774226603497f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 2), value = 11.643237368800426f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 3), value = 11.646083130428282f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 4), value = 13.3486102643562f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 5), value = 13.421817450001853f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 6), value = 13.734844672048157f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 7), value = 11.808371821628475f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 8), value = 13.906976670383472f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 9), value = 13.161627469585584f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 10), value = 13.642368164712535f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 11), value = 12.755167209621261f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 12), value = 12.13947468588139f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 13), value = 13.68979129854326f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 14), value = 11.812050924695251f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 15), value = 11.71992287051065f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 16), value = 13.003823991463284f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 17), value = 13.124946877570311f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 18), value = 11.844736927132542f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 19), value = 11.770961792864846f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 20), value = 10.926179837275598f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 21), value = 11.155771630851676f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 22), value = 11.63008791780728f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 23), value = 10.216268005840389f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 24), value = 13.611694182717626f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 25), value = 17.47706580052263f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 26), value = 20.900697260373697f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 27), value = 20.44940301651778f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 28), value = 23.47128311932538f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 29), value = 28.63506505828928f),
        LineData(Time.BusinessDay(year = 2018, month = 12, day = 30), value = 29.567577074788517f),
    )
}

@Suppress("LongMethod")
fun listRealTimeEmulationSeriesCandlestickData(): MutableList<SeriesData> {
    return mutableListOf(
        CandlestickData(
            Time.StringTime("2018-10-19"),
            open = 54.62f,
            high = 55.50f,
            low = 54.52f,
            close = 54.90f
        ),
        CandlestickData(
            Time.StringTime("2018-10-22"),
            open = 55.08f,
            high = 55.27f,
            low = 54.61f,
            close = 54.98f
        ),
        CandlestickData(
            Time.StringTime("2018-10-23"),
            open = 56.09f,
            high = 57.47f,
            low = 56.09f,
            close = 57.21f
        ),
        CandlestickData(
            Time.StringTime("2018-10-24"),
            open = 57.00f,
            high = 58.44f,
            low = 56.41f,
            close = 57.42f
        ),
        CandlestickData(
            Time.StringTime("2018-10-25"),
            open = 57.46f,
            high = 57.63f,
            low = 56.17f,
            close = 56.43f
        ),
        CandlestickData(
            Time.StringTime("2018-10-26"),
            open = 56.26f,
            high = 56.62f,
            low = 55.19f,
            close = 55.51f
        ),
        CandlestickData(
            Time.StringTime("2018-10-29"),
            open = 55.81f,
            high = 57.15f,
            low = 55.72f,
            close = 56.48f
        ),
        CandlestickData(
            Time.StringTime("2018-10-30"),
            open = 56.92f,
            high = 58.80f,
            low = 56.92f,
            close = 58.18f
        ),
        CandlestickData(
            Time.StringTime("2018-10-31"),
            open = 58.32f,
            high = 58.32f,
            low = 56.76f,
            close = 57.09f
        ),
        CandlestickData(
            Time.StringTime("2018-11-01"),
            open = 56.98f,
            high = 57.28f,
            low = 55.55f,
            close = 56.05f
        ),
        CandlestickData(
            Time.StringTime("2018-11-02"),
            open = 56.34f,
            high = 57.08f,
            low = 55.92f,
            close = 56.63f
        ),
        CandlestickData(
            Time.StringTime("2018-11-05"),
            open = 56.51f,
            high = 57.45f,
            low = 56.51f,
            close = 57.21f
        ),
        CandlestickData(
            Time.StringTime("2018-11-06"),
            open = 57.02f,
            high = 57.35f,
            low = 56.65f,
            close = 57.21f
        ),
        CandlestickData(
            Time.StringTime("2018-11-07"),
            open = 57.55f,
            high = 57.78f,
            low = 57.03f,
            close = 57.65f
        ),
        CandlestickData(
            Time.StringTime("2018-11-08"),
            open = 57.70f,
            high = 58.44f,
            low = 57.66f,
            close = 58.27f
        ),
        CandlestickData(
            Time.StringTime("2018-11-09"),
            open = 58.32f,
            high = 59.20f,
            low = 57.94f,
            close = 58.46f
        ),
        CandlestickData(
            Time.StringTime("2018-11-12"),
            open = 58.84f,
            high = 59.40f,
            low = 58.54f,
            close = 58.72f
        ),
        CandlestickData(
            Time.StringTime("2018-11-13"),
            open = 59.09f,
            high = 59.14f,
            low = 58.32f,
            close = 58.66f
        ),
        CandlestickData(
            Time.StringTime("2018-11-14"),
            open = 59.13f,
            high = 59.32f,
            low = 58.41f,
            close = 58.94f
        ),
        CandlestickData(
            Time.StringTime("2018-11-15"),
            open = 58.85f,
            high = 59.09f,
            low = 58.45f,
            close = 59.08f
        ),
        CandlestickData(
            Time.StringTime("2018-11-16"),
            open = 59.06f,
            high = 60.39f,
            low = 58.91f,
            close = 60.21f
        ),
        CandlestickData(
            Time.StringTime("2018-11-19"),
            open = 60.25f,
            high = 61.32f,
            low = 60.18f,
            close = 60.62f
        ),
        CandlestickData(
            Time.StringTime("2018-11-20"),
            open = 61.03f,
            high = 61.58f,
            low = 59.17f,
            close = 59.46f
        ),
        CandlestickData(
            Time.StringTime("2018-11-21"),
            open = 59.26f,
            high = 59.90f,
            low = 58.88f,
            close = 59.16f
        ),
        CandlestickData(
            Time.StringTime("2018-11-23"),
            open = 58.86f,
            high = 59.00f,
            low = 58.29f,
            close = 58.64f
        ),
        CandlestickData(
            Time.StringTime("2018-11-26"),
            open = 58.64f,
            high = 59.51f,
            low = 58.31f,
            close = 59.17f
        ),
        CandlestickData(
            Time.StringTime("2018-11-27"),
            open = 59.21f,
            high = 60.70f,
            low = 59.18f,
            close = 60.65f
        ),
        CandlestickData(
            Time.StringTime("2018-11-28"),
            open = 60.70f,
            high = 60.73f,
            low = 59.64f,
            close = 60.06f
        ),
        CandlestickData(
            Time.StringTime("2018-11-29"),
            open = 59.42f,
            high = 59.79f,
            low = 59.26f,
            close = 59.45f
        ),
        CandlestickData(
            Time.StringTime("2018-11-30"),
            open = 59.57f,
            high = 60.37f,
            low = 59.48f,
            close = 60.30f
        ),
        CandlestickData(
            Time.StringTime("2018-12-03"),
            open = 59.50f,
            high = 59.75f,
            low = 57.69f,
            close = 58.16f
        ),
        CandlestickData(
            Time.StringTime("2018-12-04"),
            open = 58.10f,
            high = 59.40f,
            low = 57.96f,
            close = 58.09f
        ),
        CandlestickData(
            Time.StringTime("2018-12-06"),
            open = 58.18f,
            high = 58.64f,
            low = 57.16f,
            close = 58.08f
        ),
        CandlestickData(
            Time.StringTime("2018-12-07"),
            open = 57.91f,
            high = 58.43f,
            low = 57.34f,
            close = 57.68f
        ),
        CandlestickData(
            Time.StringTime("2018-12-10"),
            open = 57.80f,
            high = 58.37f,
            low = 56.87f,
            close = 58.27f
        ),
        CandlestickData(
            Time.StringTime("2018-12-11"),
            open = 58.77f,
            high = 59.40f,
            low = 58.63f,
            close = 58.85f
        ),
        CandlestickData(
            Time.StringTime("2018-12-12"),
            open = 57.79f,
            high = 58.19f,
            low = 57.23f,
            close = 57.25f
        ),
        CandlestickData(
            Time.StringTime("2018-12-13"),
            open = 57.00f,
            high = 57.50f,
            low = 56.81f,
            close = 57.09f
        ),
        CandlestickData(
            Time.StringTime("2018-12-14"),
            open = 56.95f,
            high = 57.50f,
            low = 56.75f,
            close = 57.08f
        ),
        CandlestickData(
            Time.StringTime("2018-12-17"),
            open = 57.06f,
            high = 57.31f,
            low = 55.53f,
            close = 55.95f
        ),
        CandlestickData(
            Time.StringTime("2018-12-18"),
            open = 55.94f,
            high = 56.69f,
            low = 55.31f,
            close = 55.65f
        ),
        CandlestickData(
            Time.StringTime("2018-12-19"),
            open = 55.72f,
            high = 56.92f,
            low = 55.50f,
            close = 55.86f
        ),
        CandlestickData(
            Time.StringTime("2018-12-20"),
            open = 55.92f,
            high = 56.01f,
            low = 54.26f,
            close = 55.07f
        ),
        CandlestickData(
            Time.StringTime("2018-12-21"),
            open = 54.84f,
            high = 56.53f,
            low = 54.24f,
            close = 54.92f
        ),
        CandlestickData(
            Time.StringTime("2018-12-24"),
            open = 54.68f,
            high = 55.04f,
            low = 52.94f,
            close = 53.05f
        ),
        CandlestickData(
            Time.StringTime("2018-12-26"),
            open = 53.23f,
            high = 54.47f,
            low = 52.40f,
            close = 54.44f
        ),
        CandlestickData(
            Time.StringTime("2018-12-27"),
            open = 54.31f,
            high = 55.17f,
            low = 53.35f,
            close = 55.15f
        ),
        CandlestickData(
            Time.StringTime("2018-12-28"),
            open = 55.37f,
            high = 55.86f,
            low = 54.90f,
            close = 55.27f
        ),
        CandlestickData(
            Time.StringTime("2018-12-31"),
            open = 55.53f,
            high = 56.23f,
            low = 55.07f,
            close = 56.22f
        ),
        CandlestickData(
            Time.StringTime("2019-01-02"),
            open = 56.16f,
            high = 56.16f,
            low = 55.28f,
            close = 56.02f
        ),
        CandlestickData(
            Time.StringTime("2019-01-03"),
            open = 56.30f,
            high = 56.99f,
            low = 56.06f,
            close = 56.22f
        ),
        CandlestickData(
            Time.StringTime("2019-01-04"),
            open = 56.49f,
            high = 56.89f,
            low = 55.95f,
            close = 56.36f
        ),
        CandlestickData(
            Time.StringTime("2019-01-07"),
            open = 56.76f,
            high = 57.26f,
            low = 56.55f,
            close = 56.72f
        ),
        CandlestickData(
            Time.StringTime("2019-01-08"),
            open = 57.27f,
            high = 58.69f,
            low = 57.05f,
            close = 58.38f
        ),
        CandlestickData(
            Time.StringTime("2019-01-09"),
            open = 57.68f,
            high = 57.72f,
            low = 56.85f,
            close = 57.05f
        ),
        CandlestickData(
            Time.StringTime("2019-01-10"),
            open = 57.29f,
            high = 57.70f,
            low = 56.87f,
            close = 57.60f
        ),
        CandlestickData(
            Time.StringTime("2019-01-11"),
            open = 57.84f,
            high = 58.26f,
            low = 57.42f,
            close = 58.02f
        ),
        CandlestickData(
            Time.StringTime("2019-01-14"),
            open = 57.83f,
            high = 58.15f,
            low = 57.67f,
            close = 58.03f
        ),
        CandlestickData(
            Time.StringTime("2019-01-15"),
            open = 57.74f,
            high = 58.29f,
            low = 57.58f,
            close = 58.10f
        ),
        CandlestickData(
            Time.StringTime("2019-01-16"),
            open = 57.93f,
            high = 57.93f,
            low = 57.00f,
            close = 57.08f
        ),
        CandlestickData(
            Time.StringTime("2019-01-17"),
            open = 57.16f,
            high = 57.40f,
            low = 56.21f,
            close = 56.83f
        ),
        CandlestickData(
            Time.StringTime("2019-01-18"),
            open = 56.92f,
            high = 57.47f,
            low = 56.84f,
            close = 57.09f
        ),
        CandlestickData(
            Time.StringTime("2019-01-22"),
            open = 57.23f,
            high = 57.39f,
            low = 56.40f,
            close = 56.99f
        ),
        CandlestickData(
            Time.StringTime("2019-01-23"),
            open = 56.98f,
            high = 57.87f,
            low = 56.93f,
            close = 57.76f
        ),
        CandlestickData(
            Time.StringTime("2019-01-24"),
            open = 57.61f,
            high = 57.65f,
            low = 56.50f,
            close = 57.07f
        ),
        CandlestickData(
            Time.StringTime("2019-01-25"),
            open = 57.18f,
            high = 57.47f,
            low = 56.23f,
            close = 56.40f
        ),
        CandlestickData(
            Time.StringTime("2019-01-28"),
            open = 56.12f,
            high = 56.22f,
            low = 54.80f,
            close = 55.07f
        ),
        CandlestickData(
            Time.StringTime("2019-01-29"),
            open = 53.62f,
            high = 54.30f,
            low = 52.97f,
            close = 53.28f
        ),
        CandlestickData(
            Time.StringTime("2019-01-30"),
            open = 53.10f,
            high = 54.02f,
            low = 52.28f,
            close = 54.00f
        ),
        CandlestickData(
            Time.StringTime("2019-01-31"),
            open = 54.05f,
            high = 55.19f,
            low = 53.53f,
            close = 55.06f
        ),
        CandlestickData(
            Time.StringTime("2019-02-01"),
            open = 55.21f,
            high = 55.30f,
            low = 54.47f,
            close = 54.55f
        ),
        CandlestickData(
            Time.StringTime("2019-02-04"),
            open = 54.60f,
            high = 54.69f,
            low = 53.67f,
            close = 54.04f
        ),
        CandlestickData(
            Time.StringTime("2019-02-05"),
            open = 54.10f,
            high = 54.34f,
            low = 53.61f,
            close = 54.14f
        ),
        CandlestickData(
            Time.StringTime("2019-02-06"),
            open = 54.11f,
            high = 54.37f,
            low = 53.68f,
            close = 53.79f
        ),
        CandlestickData(
            Time.StringTime("2019-02-07"),
            open = 53.61f,
            high = 53.73f,
            low = 53.02f,
            close = 53.57f
        ),
        CandlestickData(
            Time.StringTime("2019-02-08"),
            open = 53.36f,
            high = 53.96f,
            low = 53.30f,
            close = 53.95f
        ),
        CandlestickData(
            Time.StringTime("2019-02-11"),
            open = 54.13f,
            high = 54.37f,
            low = 53.86f,
            close = 54.05f
        ),
        CandlestickData(
            Time.StringTime("2019-02-12"),
            open = 54.45f,
            high = 54.77f,
            low = 54.19f,
            close = 54.42f
        ),
        CandlestickData(
            Time.StringTime("2019-02-13"),
            open = 54.35f,
            high = 54.77f,
            low = 54.28f,
            close = 54.48f
        ),
        CandlestickData(
            Time.StringTime("2019-02-14"),
            open = 54.38f,
            high = 54.52f,
            low = 53.95f,
            close = 54.03f
        ),
        CandlestickData(
            Time.StringTime("2019-02-15"),
            open = 54.48f,
            high = 55.19f,
            low = 54.32f,
            close = 55.16f
        ),
        CandlestickData(
            Time.StringTime("2019-02-19"),
            open = 55.06f,
            high = 55.66f,
            low = 54.82f,
            close = 55.44f
        ),
        CandlestickData(
            Time.StringTime("2019-02-20"),
            open = 55.37f,
            high = 55.91f,
            low = 55.24f,
            close = 55.76f
        ),
        CandlestickData(
            Time.StringTime("2019-02-21"),
            open = 55.55f,
            high = 56.72f,
            low = 55.46f,
            close = 56.15f
        ),
        CandlestickData(
            Time.StringTime("2019-02-22"),
            open = 56.43f,
            high = 57.13f,
            low = 56.40f,
            close = 56.92f
        ),
        CandlestickData(
            Time.StringTime("2019-02-25"),
            open = 57.00f,
            high = 57.27f,
            low = 56.55f,
            close = 56.78f
        ),
        CandlestickData(
            Time.StringTime("2019-02-26"),
            open = 56.82f,
            high = 57.09f,
            low = 56.46f,
            close = 56.64f
        ),
        CandlestickData(
            Time.StringTime("2019-02-27"),
            open = 56.55f,
            high = 56.73f,
            low = 56.35f,
            close = 56.72f
        ),
        CandlestickData(
            Time.StringTime("2019-02-28"),
            open = 56.74f,
            high = 57.61f,
            low = 56.72f,
            close = 56.92f
        ),
        CandlestickData(
            Time.StringTime("2019-03-01"),
            open = 57.02f,
            high = 57.15f,
            low = 56.35f,
            close = 56.96f
        ),
        CandlestickData(
            Time.StringTime("2019-03-04"),
            open = 57.15f,
            high = 57.34f,
            low = 55.66f,
            close = 56.24f
        ),
        CandlestickData(
            Time.StringTime("2019-03-05"),
            open = 56.09f,
            high = 56.17f,
            low = 55.51f,
            close = 56.08f
        ),
        CandlestickData(
            Time.StringTime("2019-03-06"),
            open = 56.19f,
            high = 56.42f,
            low = 55.45f,
            close = 55.68f
        ),
        CandlestickData(
            Time.StringTime("2019-03-07"),
            open = 55.76f,
            high = 56.40f,
            low = 55.72f,
            close = 56.30f
        ),
        CandlestickData(
            Time.StringTime("2019-03-08"),
            open = 56.36f,
            high = 56.68f,
            low = 56.00f,
            close = 56.53f
        ),
        CandlestickData(
            Time.StringTime("2019-03-11"),
            open = 56.76f,
            high = 57.62f,
            low = 56.75f,
            close = 57.58f
        ),
        CandlestickData(
            Time.StringTime("2019-03-12"),
            open = 57.63f,
            high = 58.11f,
            low = 57.36f,
            close = 57.43f
        ),
        CandlestickData(
            Time.StringTime("2019-03-13"),
            open = 57.37f,
            high = 57.74f,
            low = 57.34f,
            close = 57.66f
        ),
        CandlestickData(
            Time.StringTime("2019-03-14"),
            open = 57.71f,
            high = 58.09f,
            low = 57.51f,
            close = 57.95f
        ),
        CandlestickData(
            Time.StringTime("2019-03-15"),
            open = 58.04f,
            high = 58.51f,
            low = 57.93f,
            close = 58.39f
        ),
        CandlestickData(
            Time.StringTime("2019-03-18"),
            open = 58.27f,
            high = 58.32f,
            low = 57.56f,
            close = 58.07f
        ),
        CandlestickData(
            Time.StringTime("2019-03-19"),
            open = 58.10f,
            high = 58.20f,
            low = 57.31f,
            close = 57.50f
        ),
        CandlestickData(
            Time.StringTime("2019-03-20"),
            open = 57.51f,
            high = 58.05f,
            low = 57.11f,
            close = 57.67f
        ),
        CandlestickData(
            Time.StringTime("2019-03-21"),
            open = 57.58f,
            high = 58.49f,
            low = 57.57f,
            close = 58.29f
        ),
        CandlestickData(
            Time.StringTime("2019-03-22"),
            open = 58.16f,
            high = 60.00f,
            low = 58.13f,
            close = 59.76f
        ),
        CandlestickData(
            Time.StringTime("2019-03-25"),
            open = 59.63f,
            high = 60.19f,
            low = 59.53f,
            close = 60.08f
        ),
        CandlestickData(
            Time.StringTime("2019-03-26"),
            open = 60.30f,
            high = 60.69f,
            low = 60.17f,
            close = 60.63f
        ),
        CandlestickData(
            Time.StringTime("2019-03-27"),
            open = 60.56f,
            high = 61.19f,
            low = 60.48f,
            close = 60.88f
        ),
        CandlestickData(
            Time.StringTime("2019-03-28"),
            open = 60.88f,
            high = 60.89f,
            low = 58.44f,
            close = 59.08f
        ),
        CandlestickData(
            Time.StringTime("2019-03-29"),
            open = 59.20f,
            high = 59.27f,
            low = 58.32f,
            close = 59.13f
        ),
        CandlestickData(
            Time.StringTime("2019-04-01"),
            open = 59.39f,
            high = 59.41f,
            low = 58.79f,
            close = 59.09f
        ),
        CandlestickData(
            Time.StringTime("2019-04-02"),
            open = 59.22f,
            high = 59.23f,
            low = 58.34f,
            close = 58.53f
        ),
        CandlestickData(
            Time.StringTime("2019-04-03"),
            open = 58.78f,
            high = 59.07f,
            low = 58.41f,
            close = 58.87f
        ),
        CandlestickData(
            Time.StringTime("2019-04-04"),
            open = 58.84f,
            high = 59.10f,
            low = 58.77f,
            close = 58.99f
        ),
        CandlestickData(
            Time.StringTime("2019-04-05"),
            open = 59.02f,
            high = 59.09f,
            low = 58.82f,
            close = 59.09f
        ),
        CandlestickData(
            Time.StringTime("2019-04-08"),
            open = 59.02f,
            high = 59.13f,
            low = 58.72f,
            close = 59.13f
        ),
        CandlestickData(
            Time.StringTime("2019-04-09"),
            open = 58.37f,
            high = 58.56f,
            low = 58.04f,
            close = 58.40f
        ),
        CandlestickData(
            Time.StringTime("2019-04-10"),
            open = 58.40f,
            high = 58.70f,
            low = 58.36f,
            close = 58.61f
        ),
        CandlestickData(
            Time.StringTime("2019-04-11"),
            open = 58.65f,
            high = 58.73f,
            low = 58.20f,
            close = 58.56f
        ),
        CandlestickData(
            Time.StringTime("2019-04-12"),
            open = 58.75f,
            high = 58.79f,
            low = 58.52f,
            close = 58.74f
        ),
        CandlestickData(
            Time.StringTime("2019-04-15"),
            open = 58.91f,
            high = 58.95f,
            low = 58.59f,
            close = 58.71f
        ),
        CandlestickData(
            Time.StringTime("2019-04-16"),
            open = 58.79f,
            high = 58.98f,
            low = 58.66f,
            close = 58.79f
        ),
        CandlestickData(
            Time.StringTime("2019-04-17"),
            open = 58.40f,
            high = 58.46f,
            low = 57.64f,
            close = 57.78f
        ),
        CandlestickData(
            Time.StringTime("2019-04-18"),
            open = 57.51f,
            high = 58.20f,
            low = 57.28f,
            close = 58.04f
        ),
        CandlestickData(
            Time.StringTime("2019-04-22"),
            open = 58.14f,
            high = 58.49f,
            low = 57.89f,
            close = 58.37f
        ),
        CandlestickData(
            Time.StringTime("2019-04-23"),
            open = 57.62f,
            high = 57.72f,
            low = 56.30f,
            close = 57.15f
        ),
        CandlestickData(
            Time.StringTime("2019-04-24"),
            open = 57.34f,
            high = 57.57f,
            low = 56.73f,
            close = 57.08f
        ),
        CandlestickData(
            Time.StringTime("2019-04-25"),
            open = 56.82f,
            high = 56.90f,
            low = 55.75f,
            close = 55.85f
        ),
        CandlestickData(
            Time.StringTime("2019-04-26"),
            open = 56.06f,
            high = 56.81f,
            low = 55.83f,
            close = 56.58f
        ),
        CandlestickData(
            Time.StringTime("2019-04-29"),
            open = 56.75f,
            high = 57.17f,
            low = 56.71f,
            close = 56.84f
        ),
        CandlestickData(
            Time.StringTime("2019-04-30"),
            open = 56.99f,
            high = 57.45f,
            low = 56.76f,
            close = 57.19f
        ),
        CandlestickData(
            Time.StringTime("2019-05-01"),
            open = 57.23f,
            high = 57.30f,
            low = 56.52f,
            close = 56.52f
        ),
        CandlestickData(
            Time.StringTime("2019-05-02"),
            open = 56.81f,
            high = 58.23f,
            low = 56.68f,
            close = 56.99f
        ),
        CandlestickData(
            Time.StringTime("2019-05-03"),
            open = 57.15f,
            high = 57.36f,
            low = 56.87f,
            close = 57.24f
        ),
        CandlestickData(
            Time.StringTime("2019-05-06"),
            open = 56.83f,
            high = 57.09f,
            low = 56.74f,
            close = 56.91f
        ),
        CandlestickData(
            Time.StringTime("2019-05-07"),
            open = 56.69f,
            high = 56.81f,
            low = 56.33f,
            close = 56.63f
        ),
        CandlestickData(
            Time.StringTime("2019-05-08"),
            open = 56.66f,
            high = 56.70f,
            low = 56.25f,
            close = 56.38f
        ),
        CandlestickData(
            Time.StringTime("2019-05-09"),
            open = 56.12f,
            high = 56.56f,
            low = 55.93f,
            close = 56.48f
        ),
        CandlestickData(
            Time.StringTime("2019-05-10"),
            open = 56.49f,
            high = 57.04f,
            low = 56.26f,
            close = 56.91f
        ),
        CandlestickData(
            Time.StringTime("2019-05-13"),
            open = 56.72f,
            high = 57.34f,
            low = 56.66f,
            close = 56.75f
        ),
        CandlestickData(
            Time.StringTime("2019-05-14"),
            open = 56.76f,
            high = 57.19f,
            low = 56.50f,
            close = 56.55f
        ),
        CandlestickData(
            Time.StringTime("2019-05-15"),
            open = 56.51f,
            high = 56.84f,
            low = 56.17f,
            close = 56.81f
        ),
        CandlestickData(
            Time.StringTime("2019-05-16"),
            open = 57.00f,
            high = 57.80f,
            low = 56.82f,
            close = 57.38f
        ),
        CandlestickData(
            Time.StringTime("2019-05-17"),
            open = 57.06f,
            high = 58.48f,
            low = 57.01f,
            close = 58.09f
        ),
        CandlestickData(
            Time.StringTime("2019-05-20"),
            open = 59.15f,
            high = 60.54f,
            low = 58.00f,
            close = 59.01f
        ),
        CandlestickData(
            Time.StringTime("2019-05-21"),
            open = 59.10f,
            high = 59.63f,
            low = 58.76f,
            close = 59.50f
        ),
        CandlestickData(
            Time.StringTime("2019-05-22"),
            open = 59.09f,
            high = 59.37f,
            low = 58.96f,
            close = 59.25f
        ),
        CandlestickData(
            Time.StringTime("2019-05-23"),
            open = 59.00f,
            high = 59.27f,
            low = 58.54f,
            close = 58.87f
        ),
        CandlestickData(
            Time.StringTime("2019-05-24"),
            open = 59.07f,
            high = 59.36f,
            low = 58.67f,
            close = 59.32f
        ),
        CandlestickData(
            Time.StringTime("2019-05-28"),
            open = 59.21f,
            high = 59.66f,
            low = 59.02f,
            close = 59.57f
        ),
    )
}

@Suppress("LongMethod")
fun listSeriesMarkersSeriesData(): MutableList<SeriesData> {
    return mutableListOf(
        BarData(
            Time.BusinessDay(year = 2018, month = 9, day = 22),
            open = 29.630237296336794f,
            high = 35.36950035097501f,
            low = 26.21522501353531f,
            close = 30.734997177569916f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 9, day = 23),
            open = 32.267626500691215f,
            high = 34.452661663723774f,
            low = 26.096868360824704f,
            close = 29.573918833457004f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 9, day = 24),
            open = 27.33996760497746f,
            high = 35.8060364835531f,
            low = 27.33996760497746f,
            close = 33.06283432964511f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 9, day = 25),
            open = 31.1654368745013f,
            high = 31.97284477478497f,
            low = 26.766743287285593f,
            close = 27.364979322283386f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 9, day = 26),
            open = 29.5901452337888f,
            high = 32.147919593347474f,
            low = 27.53289219709677f,
            close = 29.202912415085272f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 9, day = 27),
            open = 27.561741523265923f,
            high = 35.11649043301526f,
            low = 25.20035866163233f,
            close = 31.14520649627546f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 9, day = 28),
            open = 31.925975006823798f,
            high = 31.925975006823798f,
            low = 28.998500720406675f,
            close = 29.87723790403876f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 9, day = 29),
            open = 30.826956088992475f,
            high = 34.79463130873015f,
            low = 25.291546123273097f,
            close = 28.994812708315987f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 9, day = 30),
            open = 31.202920145287838f,
            high = 33.19178819590413f,
            low = 23.94419012923956f,
            close = 31.47253745770869f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 1),
            open = 26.927794164758666f,
            high = 34.6744456778885f,
            low = 26.927794164758666f,
            close = 31.091122539737423f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 2),
            open = 26.452041173938298f,
            high = 34.527917622572154f,
            low = 26.452041173938298f,
            close = 27.65703395829094f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 3),
            open = 27.74629982387605f,
            high = 29.300441707649835f,
            low = 23.761300216231263f,
            close = 29.182874625005628f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 4),
            open = 30.41599722290526f,
            high = 31.942643078777103f,
            low = 27.09925359459428f,
            close = 30.918477883682872f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 5),
            open = 25.76549797105683f,
            high = 33.4650523853759f,
            low = 25.76549797105683f,
            close = 28.15984801386293f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 6),
            open = 27.543404135965382f,
            high = 30.7227783000902f,
            low = 25.749951838020884f,
            close = 29.150903848724184f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 7),
            open = 29.34759861812077f,
            high = 31.08503530472835f,
            low = 23.395022079647823f,
            close = 25.00923131079722f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 8),
            open = 27.00266154335036f,
            high = 29.51599687178633f,
            low = 23.46749249241176f,
            close = 28.702932483799707f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 9),
            open = 25.569958099853594f,
            high = 27.669071502065417f,
            low = 25.569958099853594f,
            close = 25.626920473922613f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 10),
            open = 24.886919828178304f,
            high = 27.167620185117006f,
            low = 23.71595991386752f,
            close = 23.71595991386752f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 11),
            open = 26.14124249813686f,
            high = 29.5638477987916f,
            low = 20.82341105699825f,
            close = 25.563138238511257f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 12),
            open = 22.26412127509447f,
            high = 27.637685003390743f,
            low = 20.838507431464958f,
            close = 22.450517792778047f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 13),
            open = 25.75099239090953f,
            high = 28.12000626118839f,
            low = 21.929748303510852f,
            close = 22.63015682488669f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 14),
            open = 25.428132591291497f,
            high = 25.999229490809693f,
            low = 22.266121337091555f,
            close = 23.51047528528147f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 15),
            open = 25.07416967939059f,
            high = 25.50535192500713f,
            low = 21.96666570325133f,
            close = 21.96666570325133f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 16),
            open = 24.957206161449307f,
            high = 26.679727314857256f,
            low = 20.196753994637245f,
            close = 21.523347810451863f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 17),
            open = 23.705184745772733f,
            high = 26.754094837621004f,
            low = 18.724184302695104f,
            close = 20.160857555541725f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 18),
            open = 21.95610851644136f,
            high = 22.914889536420105f,
            low = 19.567733140100472f,
            close = 22.914889536420105f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 19),
            open = 23.216357873687972f,
            high = 25.44815512734246f,
            low = 19.54787451276509f,
            close = 20.76851802225937f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 20),
            open = 19.6289025950405f,
            high = 24.290702755740412f,
            low = 19.041541929894358f,
            close = 22.48608548162324f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 21),
            open = 23.599000037544915f,
            high = 26.839019853462844f,
            low = 20.884129956680898f,
            close = 22.01878871761756f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 22),
            open = 24.618502768742008f,
            high = 28.00099352255492f,
            low = 23.061935629399088f,
            close = 23.061935629399088f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 23),
            open = 23.840701995876866f,
            high = 28.494382608429564f,
            low = 23.840701995876866f,
            close = 25.321841131665526f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 24),
            open = 27.764925733189372f,
            high = 31.05550601484776f,
            low = 22.810929726970702f,
            close = 30.02406259204889f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 25),
            open = 29.703149280184604f,
            high = 34.0185175501095f,
            low = 26.82967654698301f,
            close = 32.06834171351323f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 26),
            open = 29.0251492427822f,
            high = 36.89478162439007f,
            low = 28.3502671011196f,
            close = 32.822663125409356f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 27),
            open = 35.040777462643284f,
            high = 35.12524316379231f,
            low = 26.805156020579663f,
            close = 34.23626219571325f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 28),
            open = 31.21349419519032f,
            high = 35.73068910379853f,
            low = 31.064101813812698f,
            close = 34.75020857236565f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 29),
            open = 32.34914826794689f,
            high = 42.381605482695505f,
            low = 30.176750284055878f,
            close = 39.24138147444552f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 30),
            open = 38.84583808993371f,
            high = 41.75165839362154f,
            low = 33.37106955991806f,
            close = 35.93904098275507f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 10, day = 31),
            open = 37.070183005323564f,
            high = 44.84460203857022f,
            low = 35.23671284121251f,
            close = 36.329972003600034f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 1),
            open = 43.31997309164893f,
            high = 48.43216497187469f,
            low = 38.30881963355285f,
            close = 41.554948540677586f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 2),
            open = 41.33946811092929f,
            high = 46.65347243834853f,
            low = 37.472215586661335f,
            close = 39.26832265482503f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 3),
            open = 44.76468593661226f,
            high = 44.76468593661226f,
            low = 40.039672147314235f,
            close = 43.42106786288436f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 4),
            open = 49.13160326887013f,
            high = 49.13160326887013f,
            low = 40.93648693038296f,
            close = 42.17817698294767f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 5),
            open = 50.46706012970579f,
            high = 54.38104598422352f,
            low = 38.159930155343616f,
            close = 47.5899156640143f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 6),
            open = 48.25899506613569f,
            high = 48.25899506613569f,
            low = 45.63208604138365f,
            close = 45.63208604138365f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 7),
            open = 52.45484210527629f,
            high = 57.55979771849961f,
            low = 45.23447676016779f,
            close = 46.01127464234881f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 8),
            open = 53.228216675179624f,
            high = 54.07804814570622f,
            low = 40.61161433961706f,
            close = 47.689867390699014f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 9),
            open = 46.193099316212816f,
            high = 56.190537353078824f,
            low = 45.01246323828753f,
            close = 49.14012661656766f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 10),
            open = 50.409245396927986f,
            high = 52.3082002787041f,
            low = 41.764144138886394f,
            close = 52.3082002787041f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 11),
            open = 48.58146178816203f,
            high = 52.653922195022126f,
            low = 47.34031788474959f,
            close = 47.34031788474959f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 12),
            open = 46.80040325283692f,
            high = 56.709349494076804f,
            low = 45.81605691554122f,
            close = 45.81605691554122f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 13),
            open = 46.042722425788355f,
            high = 58.476056411825695f,
            low = 46.042722425788355f,
            close = 51.2300776481609f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 14),
            open = 53.909068487588385f,
            high = 60.240990154306715f,
            low = 45.230741063278664f,
            close = 51.34529637385427f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 15),
            open = 53.739609857086606f,
            high = 53.739609857086606f,
            low = 44.38017019990068f,
            close = 47.595960698697894f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 16),
            open = 52.52688238296145f,
            high = 60.9220040817774f,
            low = 44.27700764117003f,
            close = 55.27309771985698f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 17),
            open = 54.46100795908005f,
            high = 57.57937841117058f,
            low = 49.50543170388487f,
            close = 49.50543170388487f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 18),
            open = 51.12284024600029f,
            high = 57.646718858433026f,
            low = 48.73280269653226f,
            close = 51.35457902694444f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 19),
            open = 53.536130807863266f,
            high = 53.536130807863266f,
            low = 51.29649965636722f,
            close = 52.99088526565045f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 20),
            open = 50.92761950009885f,
            high = 57.70671943558014f,
            low = 46.45030483558741f,
            close = 52.229112575743066f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 21),
            open = 49.30035068900293f,
            high = 58.67691694734525f,
            low = 44.63563165197862f,
            close = 58.67691694734525f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 22),
            open = 54.230476484061036f,
            high = 59.03831193868438f,
            low = 50.77849134047791f,
            close = 59.03831193868438f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 23),
            open = 57.282420985156854f,
            high = 60.4869735007396f,
            low = 44.14116488798797f,
            close = 57.93461310007337f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 24),
            open = 54.86833150125539f,
            high = 64.25102812467448f,
            low = 52.36616043331222f,
            close = 52.36616043331222f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 25),
            open = 51.689239380620386f,
            high = 64.29747922654688f,
            low = 50.71498529572432f,
            close = 60.518206306602394f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 26),
            open = 55.74863310659164f,
            high = 60.816819055612584f,
            low = 46.11238607935206f,
            close = 59.23044859881929f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 27),
            open = 52.57406222528308f,
            high = 64.2058753841427f,
            low = 48.163404012323305f,
            close = 60.593847809696896f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 28),
            open = 57.50710740029724f,
            high = 60.12123058977347f,
            low = 49.61839271711267f,
            close = 53.29152711098895f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 29),
            open = 57.33581828303538f,
            high = 58.92432332528284f,
            low = 53.27790061455899f,
            close = 57.02787118731709f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 11, day = 30),
            open = 57.527445314328595f,
            high = 67.63249690962569f,
            low = 49.603261485289146f,
            close = 54.589123556483656f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 1),
            open = 59.98835793934424f,
            high = 65.51917884840141f,
            low = 52.32535994476165f,
            close = 62.127135611086565f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 2),
            open = 52.509550731662536f,
            high = 58.49971806419494f,
            low = 52.509550731662536f,
            close = 54.759948868082255f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 3),
            open = 58.08470541982317f,
            high = 62.74987556918568f,
            low = 47.85627992158991f,
            close = 58.690428071336406f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 4),
            open = 58.28482939034761f,
            high = 69.16675825892361f,
            low = 57.41588944088662f,
            close = 57.74515245619454f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 5),
            open = 60.004299871302464f,
            high = 65.82447121605708f,
            low = 53.13330527599658f,
            close = 57.64488004774012f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 6),
            open = 61.92746155137417f,
            high = 64.36944842979646f,
            low = 49.470442234694225f,
            close = 59.94404434023895f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 7),
            open = 63.72235832229121f,
            high = 66.33649390307095f,
            low = 49.91822946887207f,
            close = 63.56396375320479f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 8),
            open = 56.64594047326664f,
            high = 65.3730920902599f,
            low = 52.604389283975664f,
            close = 60.71684658387917f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 9),
            open = 58.89798885700999f,
            high = 68.04578543284373f,
            low = 58.89798885700999f,
            close = 63.36111469854223f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 10),
            open = 58.869685789579826f,
            high = 70.99828637845869f,
            low = 52.36901833289119f,
            close = 63.15473262144694f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 11),
            open = 57.61362492091653f,
            high = 66.41975632948531f,
            low = 50.827182111530895f,
            close = 61.770769489947064f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 12),
            open = 57.869332957269656f,
            high = 66.28374056429257f,
            low = 57.05028878520954f,
            close = 63.87762958979595f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 13),
            open = 68.14347595614306f,
            high = 73.46304446829079f,
            low = 50.83319311788897f,
            close = 66.9144140431443f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 14),
            open = 56.95907344942102f,
            high = 68.81432823196859f,
            low = 56.95907344942102f,
            close = 60.69722290026252f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 15),
            open = 69.14662166493828f,
            high = 69.14662166493828f,
            low = 58.59143795311565f,
            close = 66.25235616866007f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 16),
            open = 64.0373004661208f,
            high = 72.91321850066319f,
            low = 52.079104978168345f,
            close = 65.92678310822487f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 17),
            open = 68.81814300123497f,
            high = 69.51927964796873f,
            low = 62.70935477415118f,
            close = 65.64565364397754f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 18),
            open = 63.47554821643351f,
            high = 73.6284398311906f,
            low = 58.996882824636856f,
            close = 58.996882824636856f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 19),
            open = 69.97765183896102f,
            high = 69.97765183896102f,
            low = 58.73355952507237f,
            close = 58.73355952507237f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 20),
            open = 63.22638756186111f,
            high = 65.67137242291682f,
            low = 59.9542779777421f,
            close = 61.20003065016431f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 21),
            open = 59.690029086102506f,
            high = 78.08665559197297f,
            low = 54.862707942292275f,
            close = 70.58935191024504f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 22),
            open = 66.29092355620301f,
            high = 71.82667261213395f,
            low = 65.28001993201676f,
            close = 71.82667261213395f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 23),
            open = 60.92645998120027f,
            high = 74.21283998861118f,
            low = 57.331119016099116f,
            close = 60.36728842356329f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 24),
            open = 60.211957192084036f,
            high = 72.37883919241614f,
            low = 60.211957192084036f,
            close = 72.37883919241614f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 25),
            open = 64.80282266865653f,
            high = 71.00204457933133f,
            low = 54.58446926152339f,
            close = 69.9468262738086f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 26),
            open = 66.28091239894763f,
            high = 81.00843300529249f,
            low = 54.56212171317677f,
            close = 69.58528111643206f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 27),
            open = 66.38479296949795f,
            high = 79.97207476893692f,
            low = 59.738742243860464f,
            close = 73.77893045661807f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 28),
            open = 73.80105714462456f,
            high = 73.80105714462456f,
            low = 59.95172576316864f,
            close = 73.49823170047799f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 29),
            open = 75.65816205696441f,
            high = 75.65816205696441f,
            low = 63.710206287837266f,
            close = 63.710206287837266f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 30),
            open = 70.43199072631421f,
            high = 80.48229715762909f,
            low = 62.65542750589909f,
            close = 63.42588929424237f
        ),
        BarData(
            Time.BusinessDay(year = 2018, month = 12, day = 31),
            open = 74.18101512382138f,
            high = 79.0918171034821f,
            low = 57.80109358134577f,
            close = 72.91361896511863f
        ),
    )
}

@Suppress("LongMethod")
fun listVolumeStudyAreaData(): MutableList<SeriesData> {
    return mutableListOf(
        LineData(Time.StringTime("2018-10-19"), value = 54.90f),
        LineData(Time.StringTime("2018-10-22"), value = 54.98f),
        LineData(Time.StringTime("2018-10-23"), value = 57.21f),
        LineData(Time.StringTime("2018-10-24"), value = 57.42f),
        LineData(Time.StringTime("2018-10-25"), value = 56.43f),
        LineData(Time.StringTime("2018-10-26"), value = 55.51f),
        LineData(Time.StringTime("2018-10-29"), value = 56.48f),
        LineData(Time.StringTime("2018-10-30"), value = 58.18f),
        LineData(Time.StringTime("2018-10-31"), value = 57.09f),
        LineData(Time.StringTime("2018-11-01"), value = 56.05f),
        LineData(Time.StringTime("2018-11-02"), value = 56.63f),
        LineData(Time.StringTime("2018-11-05"), value = 57.21f),
        LineData(Time.StringTime("2018-11-06"), value = 57.21f),
        LineData(Time.StringTime("2018-11-07"), value = 57.65f),
        LineData(Time.StringTime("2018-11-08"), value = 58.27f),
        LineData(Time.StringTime("2018-11-09"), value = 58.46f),
        LineData(Time.StringTime("2018-11-12"), value = 58.72f),
        LineData(Time.StringTime("2018-11-13"), value = 58.66f),
        LineData(Time.StringTime("2018-11-14"), value = 58.94f),
        LineData(Time.StringTime("2018-11-15"), value = 59.08f),
        LineData(Time.StringTime("2018-11-16"), value = 60.21f),
        LineData(Time.StringTime("2018-11-19"), value = 60.62f),
        LineData(Time.StringTime("2018-11-20"), value = 59.46f),
        LineData(Time.StringTime("2018-11-21"), value = 59.16f),
        LineData(Time.StringTime("2018-11-23"), value = 58.64f),
        LineData(Time.StringTime("2018-11-26"), value = 59.17f),
        LineData(Time.StringTime("2018-11-27"), value = 60.65f),
        LineData(Time.StringTime("2018-11-28"), value = 60.06f),
        LineData(Time.StringTime("2018-11-29"), value = 59.45f),
        LineData(Time.StringTime("2018-11-30"), value = 60.30f),
        LineData(Time.StringTime("2018-12-03"), value = 58.16f),
        LineData(Time.StringTime("2018-12-04"), value = 58.09f),
        LineData(Time.StringTime("2018-12-06"), value = 58.08f),
        LineData(Time.StringTime("2018-12-07"), value = 57.68f),
        LineData(Time.StringTime("2018-12-10"), value = 58.27f),
        LineData(Time.StringTime("2018-12-11"), value = 58.85f),
        LineData(Time.StringTime("2018-12-12"), value = 57.25f),
        LineData(Time.StringTime("2018-12-13"), value = 57.09f),
        LineData(Time.StringTime("2018-12-14"), value = 57.08f),
        LineData(Time.StringTime("2018-12-17"), value = 55.95f),
        LineData(Time.StringTime("2018-12-18"), value = 55.65f),
        LineData(Time.StringTime("2018-12-19"), value = 55.86f),
        LineData(Time.StringTime("2018-12-20"), value = 55.07f),
        LineData(Time.StringTime("2018-12-21"), value = 54.92f),
        LineData(Time.StringTime("2018-12-24"), value = 53.05f),
        LineData(Time.StringTime("2018-12-26"), value = 54.44f),
        LineData(Time.StringTime("2018-12-27"), value = 55.15f),
        LineData(Time.StringTime("2018-12-28"), value = 55.27f),
        LineData(Time.StringTime("2018-12-31"), value = 56.22f),
        LineData(Time.StringTime("2019-01-02"), value = 56.02f),
        LineData(Time.StringTime("2019-01-03"), value = 56.22f),
        LineData(Time.StringTime("2019-01-04"), value = 56.36f),
        LineData(Time.StringTime("2019-01-07"), value = 56.72f),
        LineData(Time.StringTime("2019-01-08"), value = 58.38f),
        LineData(Time.StringTime("2019-01-09"), value = 57.05f),
        LineData(Time.StringTime("2019-01-10"), value = 57.60f),
        LineData(Time.StringTime("2019-01-11"), value = 58.02f),
        LineData(Time.StringTime("2019-01-14"), value = 58.03f),
        LineData(Time.StringTime("2019-01-15"), value = 58.10f),
        LineData(Time.StringTime("2019-01-16"), value = 57.08f),
        LineData(Time.StringTime("2019-01-17"), value = 56.83f),
        LineData(Time.StringTime("2019-01-18"), value = 57.09f),
        LineData(Time.StringTime("2019-01-22"), value = 56.99f),
        LineData(Time.StringTime("2019-01-23"), value = 57.76f),
        LineData(Time.StringTime("2019-01-24"), value = 57.07f),
        LineData(Time.StringTime("2019-01-25"), value = 56.40f),
        LineData(Time.StringTime("2019-01-28"), value = 55.07f),
        LineData(Time.StringTime("2019-01-29"), value = 53.28f),
        LineData(Time.StringTime("2019-01-30"), value = 54.00f),
        LineData(Time.StringTime("2019-01-31"), value = 55.06f),
        LineData(Time.StringTime("2019-02-01"), value = 54.55f),
        LineData(Time.StringTime("2019-02-04"), value = 54.04f),
        LineData(Time.StringTime("2019-02-05"), value = 54.14f),
        LineData(Time.StringTime("2019-02-06"), value = 53.79f),
        LineData(Time.StringTime("2019-02-07"), value = 53.57f),
        LineData(Time.StringTime("2019-02-08"), value = 53.95f),
        LineData(Time.StringTime("2019-02-11"), value = 54.05f),
        LineData(Time.StringTime("2019-02-12"), value = 54.42f),
        LineData(Time.StringTime("2019-02-13"), value = 54.48f),
        LineData(Time.StringTime("2019-02-14"), value = 54.03f),
        LineData(Time.StringTime("2019-02-15"), value = 55.16f),
        LineData(Time.StringTime("2019-02-19"), value = 55.44f),
        LineData(Time.StringTime("2019-02-20"), value = 55.76f),
        LineData(Time.StringTime("2019-02-21"), value = 56.15f),
        LineData(Time.StringTime("2019-02-22"), value = 56.92f),
        LineData(Time.StringTime("2019-02-25"), value = 56.78f),
        LineData(Time.StringTime("2019-02-26"), value = 56.64f),
        LineData(Time.StringTime("2019-02-27"), value = 56.72f),
        LineData(Time.StringTime("2019-02-28"), value = 56.92f),
        LineData(Time.StringTime("2019-03-01"), value = 56.96f),
        LineData(Time.StringTime("2019-03-04"), value = 56.24f),
        LineData(Time.StringTime("2019-03-05"), value = 56.08f),
        LineData(Time.StringTime("2019-03-06"), value = 55.68f),
        LineData(Time.StringTime("2019-03-07"), value = 56.30f),
        LineData(Time.StringTime("2019-03-08"), value = 56.53f),
        LineData(Time.StringTime("2019-03-11"), value = 57.58f),
        LineData(Time.StringTime("2019-03-12"), value = 57.43f),
        LineData(Time.StringTime("2019-03-13"), value = 57.66f),
        LineData(Time.StringTime("2019-03-14"), value = 57.95f),
        LineData(Time.StringTime("2019-03-15"), value = 58.39f),
        LineData(Time.StringTime("2019-03-18"), value = 58.07f),
        LineData(Time.StringTime("2019-03-19"), value = 57.50f),
        LineData(Time.StringTime("2019-03-20"), value = 57.67f),
        LineData(Time.StringTime("2019-03-21"), value = 58.29f),
        LineData(Time.StringTime("2019-03-22"), value = 59.76f),
        LineData(Time.StringTime("2019-03-25"), value = 60.08f),
        LineData(Time.StringTime("2019-03-26"), value = 60.63f),
        LineData(Time.StringTime("2019-03-27"), value = 60.88f),
        LineData(Time.StringTime("2019-03-28"), value = 59.08f),
        LineData(Time.StringTime("2019-03-29"), value = 59.13f),
        LineData(Time.StringTime("2019-04-01"), value = 59.09f),
        LineData(Time.StringTime("2019-04-02"), value = 58.53f),
        LineData(Time.StringTime("2019-04-03"), value = 58.87f),
        LineData(Time.StringTime("2019-04-04"), value = 58.99f),
        LineData(Time.StringTime("2019-04-05"), value = 59.09f),
        LineData(Time.StringTime("2019-04-08"), value = 59.13f),
        LineData(Time.StringTime("2019-04-09"), value = 58.40f),
        LineData(Time.StringTime("2019-04-10"), value = 58.61f),
        LineData(Time.StringTime("2019-04-11"), value = 58.56f),
        LineData(Time.StringTime("2019-04-12"), value = 58.74f),
        LineData(Time.StringTime("2019-04-15"), value = 58.71f),
        LineData(Time.StringTime("2019-04-16"), value = 58.79f),
        LineData(Time.StringTime("2019-04-17"), value = 57.78f),
        LineData(Time.StringTime("2019-04-18"), value = 58.04f),
        LineData(Time.StringTime("2019-04-22"), value = 58.37f),
        LineData(Time.StringTime("2019-04-23"), value = 57.15f),
        LineData(Time.StringTime("2019-04-24"), value = 57.08f),
        LineData(Time.StringTime("2019-04-25"), value = 55.85f),
        LineData(Time.StringTime("2019-04-26"), value = 56.58f),
        LineData(Time.StringTime("2019-04-29"), value = 56.84f),
        LineData(Time.StringTime("2019-04-30"), value = 57.19f),
        LineData(Time.StringTime("2019-05-01"), value = 56.52f),
        LineData(Time.StringTime("2019-05-02"), value = 56.99f),
        LineData(Time.StringTime("2019-05-03"), value = 57.24f),
        LineData(Time.StringTime("2019-05-06"), value = 56.91f),
        LineData(Time.StringTime("2019-05-07"), value = 56.63f),
        LineData(Time.StringTime("2019-05-08"), value = 56.38f),
        LineData(Time.StringTime("2019-05-09"), value = 56.48f),
        LineData(Time.StringTime("2019-05-10"), value = 56.91f),
        LineData(Time.StringTime("2019-05-13"), value = 56.75f),
        LineData(Time.StringTime("2019-05-14"), value = 56.55f),
        LineData(Time.StringTime("2019-05-15"), value = 56.81f),
        LineData(Time.StringTime("2019-05-16"), value = 57.38f),
        LineData(Time.StringTime("2019-05-17"), value = 58.09f),
        LineData(Time.StringTime("2019-05-20"), value = 59.01f),
        LineData(Time.StringTime("2019-05-21"), value = 59.50f),
        LineData(Time.StringTime("2019-05-22"), value = 59.25f),
        LineData(Time.StringTime("2019-05-23"), value = 58.87f),
        LineData(Time.StringTime("2019-05-24"), value = 59.32f),
        LineData(Time.StringTime("2019-05-28"), value = 59.57f),
    )
}

@Suppress("LongMethod")
fun listVolumeStudySeriesData(): MutableList<SeriesData> {
    return mutableListOf(
        HistogramData(
            Time.StringTime("2018-10-19"),
            value = 19103293f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-10-22"),
            value = 21737523f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-10-23"),
            value = 29328713f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-10-24"),
            value = 37435638f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-10-25"),
            value = 25269995f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-10-26"),
            value = 24973311f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-10-29"),
            value = 22103692f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-10-30"),
            value = 25231199f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-10-31"),
            value = 24214427f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-01"),
            value = 22533201f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-02"),
            value = 14734412f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-05"),
            value = 12733842f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-06"),
            value = 12371207f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-07"),
            value = 14891287f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-08"),
            value = 12482392f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-09"),
            value = 17365762f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-12"),
            value = 13236769f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-13"),
            value = 13047907f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-14"),
            value = 18288710f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-15"),
            value = 17147123f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-16"),
            value = 19470986f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-19"),
            value = 18405731f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-20"),
            value = 22028957f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-21"),
            value = 18482233f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-23"),
            value = 7009050f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-26"),
            value = 12308876f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-27"),
            value = 14118867f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-28"),
            value = 18662989f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-29"),
            value = 14763658f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-11-30"),
            value = 31142818f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-03"),
            value = 27795428f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-04"),
            value = 21727411f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-06"),
            value = 26880429f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-07"),
            value = 16948126f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-10"),
            value = 16603356f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-11"),
            value = 14991438f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-12"),
            value = 18892182f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-13"),
            value = 15454706f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-14"),
            value = 13960870f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-17"),
            value = 18902523f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-18"),
            value = 18895777f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-19"),
            value = 20968473f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-20"),
            value = 26897008f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-21"),
            value = 55413082f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-24"),
            value = 15077207f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-26"),
            value = 17970539f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-27"),
            value = 17530977f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-28"),
            value = 14771641f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2018-12-31"),
            value = 15331758f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-02"),
            value = 13969691f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-03"),
            value = 19245411f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-04"),
            value = 17035848f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-07"),
            value = 16348982f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-08"),
            value = 21425008f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-09"),
            value = 18136000f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-10"),
            value = 14259910f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-11"),
            value = 15801548f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-14"),
            value = 11342293f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-15"),
            value = 10074386f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-16"),
            value = 13411691f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-17"),
            value = 15223854f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-18"),
            value = 16802516f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-22"),
            value = 18284771f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-23"),
            value = 15109007f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-24"),
            value = 12494109f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-25"),
            value = 17806822f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-28"),
            value = 25955718f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-29"),
            value = 33789235f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-30"),
            value = 27260036f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-01-31"),
            value = 28585447f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-01"),
            value = 13778392f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-04"),
            value = 15818901f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-05"),
            value = 14124794f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-06"),
            value = 11391442f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-07"),
            value = 12436168f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-08"),
            value = 12011657f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-11"),
            value = 9802798f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-12"),
            value = 11227550f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-13"),
            value = 11884803f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-14"),
            value = 11190094f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-15"),
            value = 15719416f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-19"),
            value = 12272877f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-20"),
            value = 11379006f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-21"),
            value = 14680547f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-22"),
            value = 12534431f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-25"),
            value = 15051182f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-26"),
            value = 12005571f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-27"),
            value = 8962776f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-02-28"),
            value = 15742971f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-01"),
            value = 10942737f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-04"),
            value = 13674737f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-05"),
            value = 15749545f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-06"),
            value = 13935530f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-07"),
            value = 12644171f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-08"),
            value = 10646710f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-11"),
            value = 13627431f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-12"),
            value = 12812980f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-13"),
            value = 14168350f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-14"),
            value = 12148349f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-15"),
            value = 23715337f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-18"),
            value = 12168133f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-19"),
            value = 13462686f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-20"),
            value = 11903104f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-21"),
            value = 10920129f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-22"),
            value = 25125385f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-25"),
            value = 15463411f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-26"),
            value = 12316901f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-27"),
            value = 13290298f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-28"),
            value = 20547060f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-03-29"),
            value = 17283871f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-01"),
            value = 16331140f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-02"),
            value = 11408146f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-03"),
            value = 15491724f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-04"),
            value = 8776028f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-05"),
            value = 11497780f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-08"),
            value = 11680538f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-09"),
            value = 10414416f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-10"),
            value = 8782061f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-11"),
            value = 9219930f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-12"),
            value = 10847504f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-15"),
            value = 7741472f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-16"),
            value = 10239261f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-17"),
            value = 15498037f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-18"),
            value = 13189013f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-22"),
            value = 11950365f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-23"),
            value = 23488682f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-24"),
            value = 13227084f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-25"),
            value = 17425466f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-26"),
            value = 16329727f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-29"),
            value = 13984965f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-04-30"),
            value = 15469002f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-01"),
            value = 11627436f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-02"),
            value = 14435436f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-03"),
            value = 9388228f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-06"),
            value = 10066145f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-07"),
            value = 12963827f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-08"),
            value = 12086743f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-09"),
            value = 14835326f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-10"),
            value = 10707335f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-13"),
            value = 13759350f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-14"),
            value = 12776175f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-15"),
            value = 10806379f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-16"),
            value = 11695064f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-17"),
            value = 14436662f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-20"),
            value = 20910590f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-21"),
            value = 14016315f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-22"),
            value = 11487448f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-23"),
            value = 11707083f,
            color = Color.argb(204, 255, 82, 82).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-24"),
            value = 8755506f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
        HistogramData(
            Time.StringTime("2019-05-28"),
            value = 3097125f,
            color = Color.argb(204, 0, 150, 136).toIntColor()
        ),
    )
}

fun listAreaSeriesData(): MutableList<SeriesData> {
    return mutableListOf(
        LineData(Time.Utc(1560211200), 40.01f),
        LineData(Time.Utc(1560297600), 52.38f),
        LineData(Time.Utc(1560384000), 36.30f),
        LineData(Time.Utc(1560470400), 34.48f),
        LineData(Time.Utc(1560556800), 40.06f),
        LineData(Time.Utc(1560643200), 56.94f),
        LineData(Time.Utc(1560729600), 41.50f),
        LineData(Time.Utc(1560816000), 34.82f)
    )
}

fun priceScaleOptions() = PriceScaleOptions(autoScale = false, position = PriceAxisPosition.LEFT)
fun timeScaleOptions() = TimeScaleOptions(visible = false)


fun priceLineOptionsWith(price: Float): PriceLineOptions {
    return PriceLineOptions(
        price = price,
        color = 0xFF016309.toInt().toIntColor(),
        lineWidth = LineWidth.TWO,
        lineStyle = LineStyle.DOTTED
    )
}

fun priceLineOptions(): PriceLineOptions {
    return PriceLineOptions(
        price = 140f,
        color = 0xFF0F2FFF.toInt().toIntColor(),
        lineWidth = LineWidth.ONE,
        lineStyle = LineStyle.SOLID
    )
}

fun singleLineData() = LineData(Time.StringTime("2019-04-11"), 90.01f)

