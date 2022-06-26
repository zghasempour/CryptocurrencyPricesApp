package com.example.cryptocurrencypricesapp.coinsDetails

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.cryptocurrencypricesapp.databinding.FragmentCoinsDetailsBinding
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.Legend.LegendForm
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.components.YAxis
import com.github.mikephil.charting.components.YAxis.AxisDependency
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet
import com.github.mikephil.charting.highlight.Highlight
import com.github.mikephil.charting.listener.OnChartValueSelectedListener
import com.github.mikephil.charting.utils.ColorTemplate

class CoinsDetailsFragment : Fragment(), OnChartValueSelectedListener {
    private lateinit var viewModel: CoinsDetailsViewModel
    private lateinit var viewModelFactory: CoinDetailViewModelFactory

    private lateinit var binding : FragmentCoinsDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val application = requireNotNull(activity).application
        binding = FragmentCoinsDetailsBinding.inflate(inflater)
        binding.lifecycleOwner = this
         val coin = CoinsDetailsFragmentArgs.fromBundle(arguments!!).selectedCoin
        viewModelFactory = CoinDetailViewModelFactory(coin,application)

        binding.viewModel = ViewModelProvider(
            this, viewModelFactory).get(CoinsDetailsViewModel::class.java)


        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        provideViewModel()
        chartConfiguration()
        observeViewModelData()
    }
    private fun provideViewModel() {
        viewModel = ViewModelProvider(
            this, viewModelFactory).get(CoinsDetailsViewModel::class.java)
    }

    private fun chartConfiguration() {
        binding.chart.setOnChartValueSelectedListener(this)

        // enable description text

        // enable description text
        binding.chart.getDescription().setEnabled(true)

        // enable touch gestures

        // enable touch gestures
        binding.chart.setTouchEnabled(true)

        // enable scaling and dragging

        // enable scaling and dragging
        binding.chart.setDragEnabled(true)
        binding.chart.setScaleEnabled(true)
        binding.chart.setDrawGridBackground(false)

        // if disabled, scaling can be done on x- and y-axis separately

        // if disabled, scaling can be done on x- and y-axis separately
        binding.chart.setPinchZoom(true)

        // set an alternative background color

        // set an alternative background color
        binding.chart.setBackgroundColor(Color.LTGRAY)

        val data = LineData()
        data.setValueTextColor(Color.WHITE)

        // add empty data

        // add empty data
        binding.chart.setData(data)

        // get the legend (only possible after setting data)

        // get the legend (only possible after setting data)
        val l: Legend = binding.chart.getLegend()

        // modify the legend ...

        // modify the legend ...
        l.form = LegendForm.LINE
        //l.typeface = tfLight
        l.textColor = Color.WHITE

        val xl: XAxis = binding.chart.getXAxis()
        //xl.typeface = tfLight
        xl.textColor = Color.WHITE
        xl.setDrawGridLines(false)
        xl.setAvoidFirstLastClipping(true)
        xl.isEnabled = true

        val leftAxis: YAxis = binding.chart.getAxisLeft()
       // leftAxis.typeface = tfLight
        leftAxis.textColor = Color.WHITE
        leftAxis.axisMaximum = 100f
        leftAxis.axisMinimum = 0f
        leftAxis.setDrawGridLines(true)

        val rightAxis: YAxis = binding.chart.getAxisRight()
        rightAxis.isEnabled = false
    }

    private fun observeViewModelData() {

        val data: LineData = binding.chart.data
        var set = data.getDataSetByIndex(0)
        // set.addEntry(...); // can be called as well
        if (set == null) {
            set = createSet()
            data.addDataSet(set)
        }

        viewModel!!.data.observe(viewLifecycleOwner) { }
       // data.addEntry(Entry(set.entryCount.toFloat(), (Math.random() * 40).toFloat() + 30f), 0)
        data.addEntry(viewModel.data.value, 0)

        data.notifyDataChanged()

        // let the chart know it's data has changed
        binding.chart.notifyDataSetChanged()

        // limit the number of visible entries
        binding.chart.setVisibleXRangeMaximum(120f)
        // chart.setVisibleYRange(30, AxisDependency.LEFT);

        // move to the latest entry
        binding.chart.moveViewToX(data.entryCount.toFloat())

        // this automatically refreshes the chart (calls invalidate())
        // chart.moveViewTo(data.getXValCount()-7, 55f,
        // AxisDependency.LEFT);
    }

    private fun createSet(): LineDataSet {
        val set = LineDataSet(null, "Dynamic Data")
        set.axisDependency = AxisDependency.LEFT
        set.color = ColorTemplate.getHoloBlue()
        set.setCircleColor(Color.WHITE)
        set.lineWidth = 2f
        set.circleRadius = 4f
        set.fillAlpha = 65
        set.fillColor = ColorTemplate.getHoloBlue()
        set.highLightColor = Color.rgb(244, 117, 117)
        set.valueTextColor = Color.WHITE
        set.valueTextSize = 9f
        set.setDrawValues(false)
        return set
    }

    private var thread: Thread? = null


    override fun onValueSelected(e: Entry?, h: Highlight?) {
        TODO("Not yet implemented")
    }

    override fun onNothingSelected() {
        TODO("Not yet implemented")
    }


}