package com.team2052.frckrawler.views.metric.impl;

import android.content.Context;
import android.support.v7.widget.AppCompatSeekBar;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import com.google.common.base.Optional;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.team2052.frckrawler.R;
import com.team2052.frckrawler.database.metric.MetricHelper;
import com.team2052.frckrawler.database.metric.MetricValue;
import com.team2052.frckrawler.tba.JSON;
import com.team2052.frckrawler.views.metric.MetricWidget;

public class TextMetricWidget extends MetricWidget {

    String value;
    private EditText valueText;

    public TextMetricWidget(Context context, MetricValue metricValue) {
        super(context, metricValue);
        inflater.inflate(R.layout.widget_metric_text, this);
    }

    public TextMetricWidget(Context context) {
        super(context);
        inflater.inflate(R.layout.widget_metric_text, this);
    }

    @Override
    public void setMetricValue(MetricValue m) {

        ((TextView) findViewById(R.id.name)).setText(m.getMetric().getName());

        valueText = (EditText) findViewById(R.id.editText1);

        final Optional<String> optionalValue = MetricHelper.getTextValue(m);
        if (optionalValue.isPresent()) {
            valueText.setText(optionalValue.get());
          }
        else
            valueText.setText("");
    }

    @Override
    public JsonElement getData() {
        CharSequence cs = valueText.getText();
        value = cs.toString();
        return MetricHelper.buildTextMetricValue(value);
    }
}