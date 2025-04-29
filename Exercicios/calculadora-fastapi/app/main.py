from fastapi import FastAPI, HTTPException
from models import OperationRequest, OperationResponse
from operations import add, subtract, multiply, divide

app = FastAPI()

@app.post("/add")
def add(operation: OperationRequest):
    return OperationResponse(result=add(operation.a, operation.b))

@app.post("/subtract")
def subtract(operation: OperationRequest):
    return OperationResponse(result=subtract(operation.a, operation.b))

@app.post("/multiply")
def multiply(operation: OperationRequest):
    return OperationResponse(result=multiply(operation.a, operation.b))

@app.post("/divide")
def divide(operation: OperationRequest):
    if operation.b == 0:
        raise HTTPException(status_code=400, detail="Division by zero is not allowed")
    return OperationResponse(result=divide(operation.a, operation.b))