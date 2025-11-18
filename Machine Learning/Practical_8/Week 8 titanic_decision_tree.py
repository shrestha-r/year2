
# Import necessary libraries
import pandas as pd  # for data manipulation
import numpy as np  # for numerical operations
import matplotlib.pyplot as plt  # for basic plotting
import seaborn as sns  # for advanced visualization
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier, plot_tree
from sklearn.metrics import accuracy_score, classification_report, confusion_matrix
from sklearn.preprocessing import LabelEncoder

print("All imports work!")


# Load the Titanic dataset
# Here we simulate loading Titanic data; in practice, load with `pd.read_csv('titanic.csv')`
data = pd.DataFrame({
    'Survived': [0, 1, 1, 0, 1, 0, 1, 0, 0, 1],
    'Pclass': [3, 1, 3, 1, 2, 3, 1, 3, 2, 1],
    'Sex': ['male', 'female', 'female', 'female', 'male', 'male', 'female', 'male', 'female', 'female'],
    'Age': [22, 38, 26, 35, 35, 27, 54, 2, 20, 30],
    'Fare': [7.25, 71.28, 7.92, 53.1, 8.05, 8.46, 51.86, 21.07, 11.13, 30.07],
    'Embarked': ['S', 'C', 'S', 'S', 'S', 'Q', 'S', 'S', 'Q', 'C']
})

# 1. Data Preprocessing

# Fill missing 'Age' values with the median
data['Age'].fillna(data['Age'].median(), inplace=True)

# Fill missing 'Embarked' values with the mode (most common value)
data['Embarked'].fillna(data['Embarked'].mode()[0], inplace=True)

# Convert categorical variables into numerical values
# Encode 'Sex' and 'Embarked' columns into numeric format
le = LabelEncoder()
data['Sex'] = le.fit_transform(data['Sex'])
data['Embarked'] = le.fit_transform(data['Embarked'])

# Exploratory Data Analysis (EDA)

# Plot count of survivors and non-survivors
plt.figure(figsize=(8, 5))
sns.countplot(x='Survived', data=data)
plt.title('Count of Survived')
plt.show()

# Display correlation heatmap to understand relationships between features
plt.figure(figsize=(8, 5))
correlation_matrix = data.corr()
sns.heatmap(correlation_matrix, annot=True, cmap='coolwarm')
plt.title('Feature Correlation Matrix')
plt.show()

# Plot age distribution by survival status
plt.figure(figsize=(8, 5))
sns.histplot(data=data, x='Age', hue='Survived', multiple='stack', kde=True)
plt.title('Age Distribution by Survival')
plt.show()

# Plot fare distribution
plt.figure(figsize=(8, 5))
sns.histplot(data['Fare'], kde=True)
plt.title('Fare Distribution')
plt.show()

# Analyze survival rate by passenger class
plt.figure(figsize=(8, 5))
sns.barplot(x='Pclass', y='Survived', data=data)
plt.title('Survival Rate by Passenger Class')
plt.show()

# 2. Splitting Data for Training and Testing

# Define features and target variable
# Features (X) are all columns except 'Survived', which is our target (y)
X = data.drop(columns=['Survived'])
y = data['Survived']

# Split the data into training and testing sets (80% training, 20% testing)
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

# 3. Decision Tree Model Training

# Initialize the Decision Tree Classifier with a specified max depth to prevent overfitting
model = DecisionTreeClassifier(max_depth=3, random_state=42)

# Train the model on the training data
model.fit(X_train, y_train)

# 4. Model Prediction and Evaluation

# Predict survival on the test set
y_pred = model.predict(X_test)

# Calculate accuracy score and display it
accuracy = accuracy_score(y_test, y_pred)
print(f"Model Accuracy: {accuracy:.2f}")

# Print classification report for precision, recall, and F1-score
print("Classification Report:\n", classification_report(y_test, y_pred))

# Generate and plot the confusion matrix
cm = confusion_matrix(y_test, y_pred)
plt.figure(figsize=(8, 6))
sns.heatmap(cm, annot=True, fmt='d', cmap='Blues', xticklabels=['Not Survived', 'Survived'], yticklabels=['Not Survived', 'Survived'])
plt.title('Confusion Matrix')
plt.xlabel('Predicted')
plt.ylabel('Actual')
plt.show()

# 5. Decision Tree Visualization

# Plotting the decision tree to visualize the splits made by the model
plt.figure(figsize=(12, 8))
plot_tree(model, feature_names=X.columns, class_names=['Not Survived', 'Survived'], filled=True, rounded=True)
plt.title('Decision Tree Visualization')
plt.show()
