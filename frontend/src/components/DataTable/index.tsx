import TBody from "./tbody";

const DataTable = () => {
    return (
        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <th>Data</th>
                        <th>Vendedor</th>
                        <th>Clientes visitados</th>
                        <th>Negócios fechados</th>
                        <th>Valor</th>
                    </tr>
                </thead>

                <tbody>
                    <TBody />
                    <TBody />
                    <TBody />
                    <TBody />
                    <TBody />
                    <TBody />
                    <TBody />
                    <TBody />
                    <TBody />
                    <TBody />
                </tbody>
            </table>
        </div>
    );
}

export default DataTable;