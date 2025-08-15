import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Movie implements Comparable<Movie> {
    long start, end;
    public Movie(long start, long end) {
        this.start = start;
        this.end = end;
    }
    @Override
    public int compareTo(Movie other) {
        return Long.compare(this.end, other.end);
    }
}

public class MovieFestival {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        ArrayList<Movie> movies = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            movies.add(new Movie(a, b));
        }

        Collections.sort(movies);

        int count = 0;
        long last_finished_time = 0;

        for (Movie movie : movies) {
            if (movie.start >= last_finished_time) {
                count++;
                last_finished_time = movie.end;
            }
        }
        System.out.println(count);
    }
}