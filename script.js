// Add an event listener to the button
document.getElementById('viewAllBtn').addEventListener('click', function() {
    // Redirect to the gallery file or page
    window.location.href = 'image.html'; // Replace with the path to your gallery file or page
});

document.getElementById('viewImagesBtn').onclick = function() {
    // Array of image file paths
    const imagePaths = [
        'image/cyber.jpg',
        'image/image5.jpg',
        'image/photo3.jpg',
        // Add more image paths as needed
    ];

    const gallery = document.getElementById('imageGallery');
    gallery.style.display = 'block'; // Show the gallery

    imagePaths.forEach(function(path) {
        const img = document.createElement('img');
        img.src = path;
        img.alt = "Image";
        gallery.appendChild(img);
    });
};