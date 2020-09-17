//package com.bala.NRSLamda.functions;
//
//import com.amazonaws.services.lambda.runtime.events.CloudWatchLogsEvent;
//import org.springframework.stereotype.Component;
//
//import java.io.BufferedReader;
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.charset.StandardCharsets;
//import java.util.Base64;
//import java.util.Base64.Decoder;
//import java.util.function.Function;
//import java.util.zip.GZIPInputStream;
//
///**
// * @author Balaji Achanta
// */
//@Component
//public class LoggerFunction implements Function<CloudWatchLogsEvent,String> {
//
//    @Override
//    public String apply(CloudWatchLogsEvent event) {
//        Decoder decoder = Base64.getDecoder();
//        byte[] decodedEvent = decoder.decode(event.getAwsLogs().getData());
//        StringBuilder output = new StringBuilder();
//        try {
//            InputStreamReader inputStreamReader;
//            try (GZIPInputStream inputStream = new GZIPInputStream(new ByteArrayInputStream(decodedEvent))) {
//                inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
//            }
//            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//            bufferedReader.lines().forEach( line -> {
//                output.append(line);
//            });
//        } catch(IOException e) {
//
//        }
//        return output.toString();
//    }
//}
