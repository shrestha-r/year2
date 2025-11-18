import pandas as pd

df = pd.read_csv("/home/rahul/Desktop/Machine Learning/Practical_8/Datasets/fake_job_postings.csv")

# print(df.head())
# print(df.to_string())
# print(df.head())
print(df.isnull().sum())



print("AFter ..................")
df["location"] = df["location"].fillna("unknown")
# df = df.dropna()
# df = df.drop_duplicates()
# print(df.head())
print(df.isnull().sum())
