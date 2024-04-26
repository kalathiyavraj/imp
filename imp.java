https://github.com/sahildoshi013/Image-Comparison-Slider


//image view to uri
    public Uri getImageUriFromImageView(ImageView imageView) {
        BitmapDrawable drawable = (BitmapDrawable) imageView.getDrawable();
        Bitmap bitmap = drawable.getBitmap();

        // Save the bitmap to a file
        String path = MediaStore.Images.Media.insertImage(
                getContentResolver(),
                bitmap,
                "ImageFromImageView",
                null
        );

        return Uri.parse(path);
    }
