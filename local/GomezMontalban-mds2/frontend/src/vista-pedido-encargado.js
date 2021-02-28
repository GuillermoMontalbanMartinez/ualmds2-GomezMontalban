import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-pedido-encargado`
 *
 * VistaPedidoEncargado element.
 *
 * @customElement
 * @polymer
 */
class VistaPedidoEncargado extends PolymerElement {

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
        return 'vista-pedido-encargado';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaPedidoEncargado.is, VistaPedidoEncargado);
