package pl.banaszewski.lukasz;

public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double wallArea = width * height;
        int missingBuckets = (int) Math.ceil(wallArea / areaPerBucket);

        int bucketCount = Math.abs(extraBuckets - missingBuckets);

        return bucketCount;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if(area <= 0) {
            return -1;
        }

        double width, height;
        width = height = Math.sqrt(area);

        return getBucketCount(width, height, areaPerBucket);
    }
}
