function logout() {
    fetch('/api/userAccount/logout', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        }
    })
    .then(response => response.json())
    .then(data => {
        if (data.success) {
            alert('Logged out successfully!');
            window.location.href = '/'; // Redirect to home page
        } else {
            alert('Error logging out. Please try again.');
        }
    })
    .catch(error => {
        console.error('Error:', error);
        alert('There was a problem logging out. Please try again.');
    });
}
