# Artificial Intelligence Chatbot Project

## Project Title
Artificial Intelligence Chatbot

## Project Overview
This project involves the development of an intelligent chatbot leveraging natural language processing (NLP) and machine learning techniques. The chatbot is designed to facilitate interactive and automated communication, providing users with a seamless conversational experience. This project is a part of the tasks assigned during the CodeAlpha internship.

## Features
- Utilizes the Gemini Pro model from Google Generative AI for generating responses.
- Streamlit-based user interface for easy interaction.
- Maintains chat history within the session for a continuous conversation experience.
- Designed to be easily extendable and configurable for various use cases.

## Technologies Used
- **Python**: The main programming language used for the project.
- **Streamlit**: Used for building the web-based user interface.
- **Google Generative AI (Gemini Pro)**: Used for generating conversational responses.
- **dotenv**: Used for managing environment variables securely.

## Setup Instructions
1. **Clone the Repository**: Clone the project repository from the desired source.
2. **Install Dependencies**: Ensure you have Python installed, then run `pip install -r requirements.txt` to install all necessary dependencies.
3. **Environment Variables**: Create a `.env` file in the project directory with your Google API key.
   ```
   GOOGLE_API_KEY=your_google_api_key_here
   ```
4. **Run the Application**: Start the Streamlit app by running the command:
   ```
   streamlit run app.py
   ```

## Usage
1. Open the Streamlit app in your browser.
2. Enter your question in the input field and click the "Ask the question" button.
3. The chatbot will generate a response using the Gemini Pro model and display it.
4. The chat history is maintained and displayed for continuous conversation.

## Future Enhancements
- Incorporate more advanced NLP techniques for better response generation.
- Add support for more conversational models.
- Enhance the user interface with more features and customization options.
- Implement user authentication for personalized chat history.

## Acknowledgements
This project was completed as part of the CodeAlpha internship tasks. Special thanks to the CodeAlpha team for their support and guidance throughout the internship.
