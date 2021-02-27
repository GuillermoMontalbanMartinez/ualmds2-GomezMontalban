import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidos-entregados`
 *
 * VistaPedidosEntregados element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidosEntregados extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-pedidos-entregados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidosEntregados.is, VistaPedidosEntregados);
