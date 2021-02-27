import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedidos-a-entregar`
 *
 * VistaPedidosAEntregar element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidosAEntregar extends PolymerElement {

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
        return 'vista-pedidos-a-entregar';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidosAEntregar.is, VistaPedidosAEntregar);
