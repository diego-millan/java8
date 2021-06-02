package br.com.java8.streamresume;

import br.com.java8.streamresume.domain.Boat;
import br.com.java8.streamresume.domain.Car;
import br.com.java8.streamresume.domain.Vehicle;
import com.sun.jdi.request.DuplicateRequestException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamResume {
    public static void main(String[] args) {
        // Create new Stream
        Stream<Integer> stream = Stream.of(1, 2, 3);

        // Converting List to Stream
        List<Integer> anArrayList = Arrays.asList(1,2,3);
        anArrayList.stream(); // Stream created!

        // Using filters
        List<Integer> filteredList = anArrayList.stream()
                .filter(p -> p > 0)
                .collect(Collectors.toList()); // Converting back stream to new list

        // Use Map to stream
        List<Integer> myMappedList = Stream.of(1,2,3,4)
                .map(value -> value + 2)
                .collect(Collectors.toList());

        // Using count
        long numberOfElements = Stream.of(1,2,3,4).count();

        // Reduce - Used to aggregate values
        Optional<Integer> sum = Stream
                .of(1,3,5)
                .reduce((accumulative, currentIndex) -> accumulative + currentIndex);

        // Reduce using validation
        String color = "blue";
        List<Car> carList = Arrays.asList(
                new Car("red", 4),
                new Car("blue", 4));

        Optional<Car> checkDuplicated = carList.stream()
                .filter(value -> value.getColor().equals(color))
                .reduce((element, otherElement) -> {
                    throw new DuplicateRequestException();
                });

        // Sum should be ((1+3)+5) = 9 - In this case... Optional.get() = 9;

        // anyMatch, verify if have any occurrence of an expression
        boolean anyMatch = Stream
                .of(1,2,3,4)
                .anyMatch(value -> value == 2);

        // All Match - Check if every element is according to expression
        boolean allMatch = Stream
                .of(1,2,3,4)
                .allMatch(value -> value > 0);

        // None Match - The oposite of all Match, check if none element match the expression
        boolean noneMatch = Stream
                .of(1,2,3,4)
                .noneMatch(value -> value < 0);

        // Peek - Accept lambda where you can do actions on stream
        // The same stream will be resulted, so its usefull to debug
        Stream
                .of(1,3,4)
                .peek(value -> System.out.println(value));

        // Including bodies to Stream
        List<Vehicle> vehicles = Stream
                .of("car", "boat")
                .map(vehicle -> {
                    if (vehicle.equalsIgnoreCase("boat")) {
                        return new Boat();
                    }
                    return new Car("", 0);
                })
                .collect(Collectors.toList()); // will return two vehicles - car and boat

        // Chaining Streams - When an operation return a stream, you can chain with other
        Stream<Car> cars = Arrays.asList(new Car("Blue", 4)).stream();

        List<String> vehiclesString = cars
                .filter(car -> car.getWheelsNumber() > 2)
                .map(car -> "A " + car.getColor() + " car has " + car.getWheelsNumber() + " of wheels.")
                .collect(Collectors.toList());

        // Recursive Stream
        public static Stream<File> getFiles(File file) {
             return Arrays.stream(file.listFiles())
                     .filter(f -> !f.getName().startsWith("."))
                     .flatMap(f -> {
                        if(f.isDirectory()) {
                            return getFiles(f);
                        } else {
                            return Stream.of(f);
                        }
                    });

        }
    }
}
