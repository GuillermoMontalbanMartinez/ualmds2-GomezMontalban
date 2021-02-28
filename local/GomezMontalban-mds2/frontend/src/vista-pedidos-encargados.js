import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidos-encargados`
 *
 * VistaPedidosEncargados element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidosEncargados extends PolymerElement {

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
        return 'vista-pedidos-encargados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidosEncargados.is, VistaPedidosEncargados);
